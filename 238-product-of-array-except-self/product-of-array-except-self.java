class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int [nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        int leftPro = 1;
        int rightPro = 1;
        for (int i = 1; i < nums.length; i++) {
            leftPro = leftPro * nums[i - 1];
            left[i] = leftPro;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightPro = rightPro * nums[i + 1];
            right[i] = rightPro;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}