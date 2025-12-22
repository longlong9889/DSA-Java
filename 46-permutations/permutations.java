class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allPermutations = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        backtrack(allPermutations, currentList, nums);
        return allPermutations;
    }
    private void backtrack(List<List<Integer>> allPermutations, List<Integer> currentList, int[] nums) {
        if (currentList.size() == nums.length) {
            allPermutations.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (currentList.contains(nums[i])) {
                continue;
            }
            currentList.add(nums[i]);
            backtrack(allPermutations, currentList, nums);
            currentList.remove(currentList.size() - 1);
        }
    }
}