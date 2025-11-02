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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderArr = new ArrayList<>();
        helper(root, inOrderArr);
        return inOrderArr;
    }
    private void helper(TreeNode root, List<Integer> inOrderArr) {
        if (root == null) return;
        helper(root.left, inOrderArr);
        if (root != null) {
            inOrderArr.add(root.val);
        }
        helper(root.right, inOrderArr);
    }
}