class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new LinkedList<>();
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    public void backtrack (List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start) {
        if (target == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backtrack(list, tempList, candidates, target - candidates[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
}