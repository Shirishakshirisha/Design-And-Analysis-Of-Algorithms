public class MaxDepthOfTree {
    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        // Create a sample binary tree:
        //         1
        //       /   \
        //      2     3
        //     / \
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Create an instance of Solution
        MaxDepthOfTree solution = new  MaxDepthOfTree();

        // Call maxDepth and print the result
        int depth = solution.maxDepth(root);
        System.out.println("The maximum depth of the tree is: " + depth);
    }

}
