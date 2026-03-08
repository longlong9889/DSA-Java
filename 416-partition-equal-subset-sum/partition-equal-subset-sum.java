class Solution {
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        memo = new Boolean[nums.length][target + 1];
        return dfs(nums, 0, target);
    }
    private boolean dfs(int[] nums, int i, int target) {
        if (i == nums.length) {
            return target == 0;
        }
        if (target < 0) {
            return false;
        }
        if (memo[i][target] != null) {
            return memo[i][target];
        }
        memo[i][target] = dfs(nums, i + 1, target) || dfs(nums, i + 1, target - nums[i]);
        return memo[i][target];
    }
}