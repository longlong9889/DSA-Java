class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList<>();
        backtrack(ans, new ArrayList<Integer>(), nums, 0, set);
        return ans;
    }
    public void backtrack (List<List<Integer>> list, List<Integer> tempList, int[] nums, int start, Set<List<Integer>> set) {
        if (!set.contains(tempList)) {
            set.add(tempList);
            list.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1, set);
            tempList.remove(tempList.size() - 1);
        }
    }
}