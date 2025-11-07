import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class ReverseLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> q = new LinkedList<>();
        q.offerLast(root);
        while (!q.isEmpty()) {
            List<Integer> t = new ArrayList<>();
            for (int i = q.size(); i > 0; --i) {
                TreeNode node = q.pollFirst();
                t.add(node.val);
                if (node.left != null) {
                    q.offerLast(node.left);
                }
                if (node.right != null) {
                    q.offerLast(node.right);
                }
            }
            ans.addFirst(t);
        }
        return ans;
    }

    public static void main(String[] args) {
    // Create a sample binary tree:
    //         3
    //       /   \
    //      9    20
    //          /  \
    //         15   7

    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    // Create an instance of Solution
    ReverseLevelOrderTraversal solution = new ReverseLevelOrderTraversal();

    // Call levelOrderBottom and print the result
    List<List<Integer>> result = solution.levelOrderBottom(root);

    System.out.println("Level order traversal (bottom-up): " + result);
}

}