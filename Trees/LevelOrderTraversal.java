package Trees;
import java.util.*;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root==null){
            return wrapList;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++){
                if(q.peek().left !=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right !=null){
                    q.offer(q.peek().right);
                }
                subList.add(q.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

}
