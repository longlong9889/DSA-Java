class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<>(), candidates, target, 0, set);
        return ans;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start, Set<List<Integer>> set) {
        if (target == 0) {
            if (!set.contains(tempList)) {
                set.add(tempList);
                list.add(new ArrayList<>(tempList));
            }
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                return;
            }
            tempList.add(candidates[i]);
            backtrack(list, tempList, candidates, target - candidates[i], i + 1, set);
            tempList.remove(tempList.size() - 1);
        }
    }
}