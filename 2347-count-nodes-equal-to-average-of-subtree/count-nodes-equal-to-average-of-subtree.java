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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        averageCalculate(root);
        return count;
    }
    private int[] averageCalculate(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        int[] leftSubTree = averageCalculate(root.left);
        int[] rightSubTree = averageCalculate(root.right);
        int sum = leftSubTree[0] + rightSubTree[0] + root.val;
        int nodes = leftSubTree[1] + rightSubTree[1] + 1;
        if (root.val == sum / nodes) {
            count++;
        }
        return new int[]{sum, nodes};
    }
}