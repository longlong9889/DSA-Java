class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int num: nums) {
            q.add(num);
        }
        for (int i = k - 1; i > 0; i--) {
            q.poll();
        }
        return q.peek();
    }
}