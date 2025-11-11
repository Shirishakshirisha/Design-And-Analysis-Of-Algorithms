package Trees;

// Node class for the binary tree
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class DfsBinaryTree {

    // 🔹 1. Preorder DFS (Root → Left → Right)
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // 🔹 2. Inorder DFS (Left → Root → Right)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // 🔹 3. Postorder DFS (Left → Right → Root)
    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Main method to test DFS traversals
    public static void main(String[] args) {
        // Constructing the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("DFS Traversals of the Binary Tree:\n");

        System.out.print("Preorder  (Root-Left-Right): ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder   (Left-Root-Right): ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder (Left-Right-Root): ");
        postorder(root);
        System.out.println();
    }
}
