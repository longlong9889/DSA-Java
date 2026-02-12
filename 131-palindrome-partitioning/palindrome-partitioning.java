class Solution {
    boolean[][] dp;
    public List<List<String>> partition(String s) {
        int n = s.length();
        dp = new boolean[n][n];
        for (int l = 1; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                dp[i][i + l - 1] = s.charAt(i) == s.charAt(i + l - 1) && 
                (i + 1 > i + l - 2 || dp[i + 1][i + l - 2]);
            }
        }
        List<String> tempList = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        dfs(0, tempList, res, s);
        return res;
    }
    private void dfs(int start, List<String> tempList, List<List<String>> res, String s) {
        if (start >= s.length()) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        
        for (int i = start; i < s.length(); i++) {
            if (dp[start][i]) {
                tempList.add(s.substring(start, i + 1));
                dfs(i + 1, tempList, res, s);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}