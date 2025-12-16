class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int maxLength = 0;
        Set<String> wordSet = new HashSet<>(wordDict);
        for (String word: wordDict) {
            maxLength = Math.max(maxLength, word.length());
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLength); j--) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}