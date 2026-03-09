class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> current = new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        backtrack(candidates, target, current, result, 0, 0);
        List<List<Integer>> actualResult = new ArrayList<>(result);
        return actualResult; 
    }
    private void backtrack(int[] candidates, int target, List<Integer> current, Set<List<Integer>> result, int start, int sum) {
        if (sum == target) {
            if (result.contains(current)) {
                return;
            }
            result.add(new ArrayList<>(current));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            current.add(candidates[i]);
            backtrack(candidates, target, current, result, i + 1, sum + candidates[i]);
            current.remove(current.size() - 1);
        }
    }
}