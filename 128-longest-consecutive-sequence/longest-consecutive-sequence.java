class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int i: nums) {
            set.add(i);
        }   
        for (int num: set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}