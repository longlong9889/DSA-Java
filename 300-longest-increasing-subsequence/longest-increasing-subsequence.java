class Solution {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }       
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}