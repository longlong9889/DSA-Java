class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> notTrust = new HashMap<>();
        for (int[] relationship: trust) {
            notTrust.put(relationship[0], notTrust.getOrDefault(relationship[0], 0) + 1);
        }
        Map<Integer, Integer> trusts = new HashMap<>();
        for (int[] relationship: trust) {
                trusts.put(relationship[1], trusts.getOrDefault(relationship[1], 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            if (!notTrust.containsKey(i) && trusts.getOrDefault(i, 0) == n - 1) {
                return i;
            }
        }
        return -1;
    }
}