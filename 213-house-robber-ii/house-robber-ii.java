class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] withTail = new int[nums.length - 1];
        int[] withoutTail = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            withTail[i] = nums[i + 1];
            withoutTail[i] = nums[i];
        }
        int robTail = robHouse(withTail);
        int robwithoutTail = robHouse(withoutTail);
        return Math.max(robTail, robwithoutTail);
    }
    private int robHouse(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}