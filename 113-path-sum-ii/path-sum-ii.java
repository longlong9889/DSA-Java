/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<List<Integer>> lists = new Stack<>();
        Stack<TreeNode> node = new Stack<>();
        Stack<Integer> sums = new Stack<>();
        node.push(root);
        sums.push(root.val);
        lists.push(new ArrayList<>(Arrays.asList(root.val)));
        while (!node.isEmpty()) {
            TreeNode n = node.pop();
            int currentSum = sums.pop();
            List<Integer> list = lists.pop();
            if (n.right == null && n.left == null && currentSum == targetSum) {
                ans.add(list);
            }
            if (n.right != null) {
                node.push(n.right);
                sums.push(currentSum + n.right.val);
                List<Integer> newPath = new ArrayList<>(list);
                newPath.add(n.right.val);
                lists.push(newPath);
            }
             if (n.left != null) {
                node.push(n.left);
                sums.push(currentSum + n.left.val);
                List<Integer> newPath = new ArrayList<>(list);
                newPath.add(n.left.val);
                lists.push(newPath);
            }
        }
        return ans;
    }
}