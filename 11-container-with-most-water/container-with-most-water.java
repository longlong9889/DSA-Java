class Solution {
    public int maxArea(int[] height) {
        int n = height.length - 1;
        int left = 0; int right = n; int max = 0;
        while (left < right) {
            max = Math.max((Math.min(height[left], height[right]) * (right - left)), max);
            if (height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
}