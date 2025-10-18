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
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        list.add(root.val);
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            if (node.left != null) {
                s.push(node.left);
                list.add(node.left.val);
            }
            if (node.right != null) {
                s.push(node.right);
                list.add(node.right.val);
            }
        }
        PriorityQueue<Integer> ans = new PriorityQueue<>((a, b) -> a - b);
        ans.addAll(list);
        int smallest = 0;
        for (int i = 0; i < k; i++) {
            smallest = ans.poll();
        }
        return smallest;
    }
}