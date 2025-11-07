class ConstructBinaryTreeFromArray {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return constructBSTRecursive(0, nums.length - 1);
    }

    private TreeNode constructBSTRecursive(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode leftSubtree = constructBSTRecursive(left, mid - 1);
        TreeNode rightSubtree = constructBSTRecursive(mid + 1, right);
        TreeNode node = new TreeNode(nums[mid], leftSubtree, rightSubtree);
        return node;
    }

    public static void main(String[] args) {

        ConstructBinaryTreeFromArray obj = new ConstructBinaryTreeFromArray();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = obj.sortedArrayToBST(nums);
        System.out.print("In-order traversal of the constructed BST: ");
        inOrderTraversal(root);
    }

    private static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
}
