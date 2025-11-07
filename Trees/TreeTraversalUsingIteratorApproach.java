package Trees;
import java.util.*;

public class TreeTraversalUsingIteratorApproach {

    public List<Integer> preorderTraversal(Node node){
        List<Integer> preorder = new ArrayList<Integer>();
        if(node == null){
             return preorder;
        }
        Stack<Node> st = new Stack<Node>();
        st.push(node);
        while(!st.isEmpty()){
            node = st.pop();
            preorder.add(node.data);
            if(node.right!=null){
                st.push(node.right);
            }
            if(node.left!=null){
                st.push(node.left);
            }
        }
        return preorder;
    }

    public List<Integer> inorderTraversal(Node node){
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();
       while(true){
        if(node!=null){
            st.push(node);
            node = node.left;
        }
        else{
            if(st.isEmpty()){
                break;
            }
            node = st.pop();
            inorder.add(node.data);
            node = node.right;
        }
       }
        return inorder;
    }
}
