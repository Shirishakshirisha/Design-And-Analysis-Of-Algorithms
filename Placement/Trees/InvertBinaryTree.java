class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);
        root.left = r;
        root.right = l;
        return root;
    }

    public static void main(String[] args) {
        // Example 1:
        //     4
        //    / \
        //   2   7
        //  / \ / \
        // 1  3 6  9
        TreeNode root1 = new TreeNode(4, 
                            new TreeNode(2, new TreeNode(1), new TreeNode(3)), 
                            new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        InvertBinaryTree solution = new InvertBinaryTree();
        TreeNode invertedRoot1 = solution.invertTree(root1);
        System.out.println("Inverted Tree 1 (Pre-order):");
        printTree(invertedRoot1);
        System.out.println();

        // Example 2:
        //         1
        //       /   \
        //      2     3
        //     / \
        //    4   5
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        TreeNode invertedRoot2 = solution.invertTree(root2);
        System.out.println("Inverted Tree 2 (Pre-order):");
        printTree(invertedRoot2);
        System.out.println();
    }

    // Helper method to print the tree in pre-order traversal
    private static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}