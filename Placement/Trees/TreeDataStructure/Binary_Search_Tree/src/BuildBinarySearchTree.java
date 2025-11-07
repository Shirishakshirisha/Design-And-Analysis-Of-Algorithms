import java.util.Scanner;

class BuildBinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert method to build a Binary Search Tree
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Build tree using user input
    public Node buildTree(Node root, Scanner in) {
        System.out.println("Enter data to insert into the BST (-1 to stop):");
        while (true) {
            int data = in.nextInt();
            if (data == -1) {
                break;
            }
            root = insert(root, data);
        }
        return root;
    }

    // In-order traversal to display the tree
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BuildBinarySearchTree tree = new BuildBinarySearchTree();
        Node root = null;

        // Build the tree
        root = tree.buildTree(root, in);

        // Display the tree using in-order traversal
        System.out.println("In-order traversal of the BST:");
        tree.inOrderTraversal(root);
        System.out.println("\nTree construction completed successfully.");
    }
}
