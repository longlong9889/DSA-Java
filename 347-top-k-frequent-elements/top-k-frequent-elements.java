class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];
        q.addAll(map.entrySet());
        for (int i = 0; i < k; i++) {
            ans[i] = q.poll().getKey();
        }
        return ans;
    }
}