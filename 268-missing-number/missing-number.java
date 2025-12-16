class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        for (int num: nums) {
            actualSum += num;
        }
        int sumWithMissingNumber = (nums.length + 1) * nums.length / 2;
        return sumWithMissingNumber - actualSum;
    }
}