class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int leftPro = 1;
        int rightPro = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (leftPro == 0) {
                leftPro = 1;
            }
            if (rightPro == 0) {
                rightPro = 1;
            }
            leftPro *= nums[i];
            rightPro *= nums[nums.length - i - 1];
            max = Math.max(max, Math.max(leftPro, rightPro));
        }
        return max;
    }
}