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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return diameter;
    }
    private int findHeight(TreeNode root) {
        if (root == null) return 0;
        int leftNode = findHeight(root.left);
        int rightNode = findHeight(root.right);
        int currentDiameter = leftNode + rightNode;
        diameter = Math.max(currentDiameter, diameter);
        return Math.max(leftNode, rightNode) + 1;
    }
}