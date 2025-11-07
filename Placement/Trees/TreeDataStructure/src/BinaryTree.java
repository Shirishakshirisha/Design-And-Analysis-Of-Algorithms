// import java.util.*;

// class Hello{
//     class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         } 
//     }

    
//     public Node buildTree(Node root , Scanner in){
        
//     int data = in.nextInt();
//     if(data == -1){
//         return null;
//     }

//     root = new Node(data);

//     System.out.println("Enter the left child of the :" + root.data);
//     root.left = buildTree(root.left , in);

//     System.out.println("Enter the right child of the :"+root.data);
//     root.right = buildTree(root.right , in);
     
//     return root;

//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         Hello tree = new Hello();
//         Node root= null;
//         root = tree.buildTree(root , in);
//         System.out.println("Completed successfully");
//     }
// }



import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.print("Enter the root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner , Node node)
    {
        System.out.println("Do you want to enter the left of:"+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left child of: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner , node.left);
        }

        System.out.println("Do you want to enter the right of:"+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right child of: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner , node.right);
        }
        
    }

    public void display(){
        display(this.root , "");
    }

    private void display(Node node , String indent)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right , indent+"\t");
    }

}
