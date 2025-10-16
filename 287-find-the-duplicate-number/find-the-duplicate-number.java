class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(nums[i])) {
                s.add(nums[i]);
            }
            else return nums[i];
        }
        return 0;
    }
}