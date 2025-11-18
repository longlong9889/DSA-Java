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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        maxSubTree(root);
        return max;
    }
    private int maxSubTree(TreeNode root) {
        if (root == null) return 0;
        int leftNode = maxSubTree(root.left);
        int rightNode = maxSubTree(root.right);
        if (leftNode < 0) leftNode = 0;
        if (rightNode < 0) rightNode = 0;
        max = Math.max(max, leftNode + rightNode + root.val);
        return Math.max(leftNode, rightNode) + root.val;
    }
}