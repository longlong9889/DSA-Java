class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, current, result, 0, 0);
        return result; 
    }
    private void backtrack(int[] candidates, int target, List<Integer> current, List<List<Integer>> result, int start, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(candidates, target, current, result, i, sum + candidates[i]);
            current.remove(current.size() - 1);
        }
    }
}