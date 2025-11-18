class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0,1);
        for (int num: nums) {
            Map<Integer, Integer> dpNew = new HashMap<>();
            for (int sum: dp.keySet()) {
                int count = dp.get(sum);
                dpNew.put(sum + num, dpNew.getOrDefault(sum + num, 0) + count);
                dpNew.put(sum - num, dpNew.getOrDefault(sum - num, 0) + count);
            }
            dp = dpNew;
        }
        return dp.getOrDefault(target, 0);
    }
}