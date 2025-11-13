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
    int sum = 0;
    public int findTilt(TreeNode root) {
        sumTilt(root);
        return sum;
    }
    private int sumTilt(TreeNode root) {
        if (root == null) return 0;
        int leftTree = sumTilt(root.left);
        int rightTree = sumTilt(root.right);
        sum += Math.abs(leftTree - rightTree);
        return root.val + leftTree + rightTree;
    }
}