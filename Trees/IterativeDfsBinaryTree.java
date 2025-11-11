package Trees;

import java.util.Stack;

// Node class for the binary tree
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class IterativeDfsBinaryTree {

    // 🔹 1. Preorder DFS (Root → Left → Right)
    public static void preorder(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.val + " ");

            // Push right first so that left is processed first
            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
        }
    }

    // 🔹 2. Inorder DFS (Left → Root → Right)
    public static void inorder(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Visit node
            current = stack.pop();
            System.out.print(current.val + " ");

            // Visit right subtree
            current = current.right;
        }
    }

    // 🔹 3. Postorder DFS (Left → Right → Root)
    // Using two stacks
    public static void postorder(Node root) {
        if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null)
                stack1.push(current.left);
            if (current.right != null)
                stack1.push(current.right);
        }

        // Print nodes in reverse order from stack2
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }

    // 🔹 Main method to test all traversals
    public static void main(String[] args) {
        // Constructing the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Iterative DFS Traversals of the Binary Tree:\n");

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
