class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);
        for (int num: nums) {
            Map<Integer, Integer> newdp = new HashMap<>();
            for (int sum: dp.keySet()) {
                int count = dp.get(sum);
                newdp.put(sum + num, newdp.getOrDefault(sum + num, 0) + count);
                newdp.put(sum - num, newdp.getOrDefault(sum - num, 0) + count);
            }
            dp = newdp;
        }
        return dp.getOrDefault(target, 0);
    }
}