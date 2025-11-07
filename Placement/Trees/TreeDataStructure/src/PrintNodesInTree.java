import java.util.Scanner;

public class PrintNodesInTree {
    // Node class
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // Method to build the tree
    public Node buildTree(Node root) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the data (-1 to stop):");
        int value = in.nextInt();
        
        if (value == -1) {

            return null; // Termination condition
        }
        
        root = new Node(value);
        
        // Build left subtree
        System.out.println("Enter the data for the left child of " + root.value);
        root.left = buildTree(root.left);
        
        // Build right subtree
        System.out.println("Enter the data for the right child of " + root.value);
        root.right = buildTree(root.right);
        
        return root;
    }

    public static void main(String[] args) {

        PrintNodesInTree tree = new PrintNodesInTree();
        Node root = null;
        root = tree.buildTree(root);
    }
}
