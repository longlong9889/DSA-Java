class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sumKElements = 0;
        for (int i = 0; i < k; i++) {
            sumKElements += nums[i];
        }
        int max = sumKElements;
        if (nums.length == k) {
            max = sumKElements;
        }
        else {
            for (int i = k; i < nums.length; i++) {
                sumKElements = sumKElements + nums[i] - nums[i - k];
                max = Math.max(max, sumKElements);
            }
        }
        return (double)(max) / (double)(k);
    }
}