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
    int difference = Integer.MIN_VALUE;
    public boolean isBalanced(TreeNode root) {
        maxHeight(root);
        return difference <= 1;
    }
    private int maxHeight(TreeNode root) {
        if (root == null) return 0;
        int leftNode = maxHeight(root.left);
        int rightNode = maxHeight(root.right);
        difference = Math.max(difference, Math.abs(leftNode - rightNode));
        return Math.max(leftNode, rightNode) + 1;
    }
}