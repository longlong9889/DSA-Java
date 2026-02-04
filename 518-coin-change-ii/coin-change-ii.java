class Solution {
    public int change(int amount, int[] coins) {
        int[][] memo = new int[amount + 1][coins.length + 1];
        for (int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return dfs(amount, coins, 0, memo);
    }
    private int dfs(int amount, int[] coins, int i, int[][] memo) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0 || i >= coins.length) {
            return 0;
        }
        if (memo[amount][i] != -1) {
            return memo[amount][i];
        }
        int take = dfs(amount - coins[i], coins, i, memo);
        int skip = dfs(amount, coins, i + 1, memo);
        return memo[amount][i] = take + skip;
    }
}