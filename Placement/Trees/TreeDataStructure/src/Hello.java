import java.util.*;

class Hello{
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        } 
    }

    
    public Node buildTree(Node root , Scanner in){
        
    int data = in.nextInt();
    if(data == -1){
        return null;
    }

    root = new Node(data);

    System.out.println("Enter the left child of the :" + root.data);
    root.left = buildTree(root.left , in);

    System.out.println("Enter the right child of the :"+root.data);
    root.right = buildTree(root.right , in);
     
    return root;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hello tree = new Hello();
        Node root= null;
        root = tree.buildTree(root , in);
        System.out.println("Completed successfully");
    }
}