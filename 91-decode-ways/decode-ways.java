class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        } 
        if (s.length() == 1) {
            return 1;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        if (s.charAt(1) != '0') {
            dp[1] = 1;
        }
        else {
            dp[1] = 0;
        }
        for (int i = 2; i <= s.length(); i++) {
            int oneDigitNum = Integer.valueOf(s.substring(i - 1, i));
            int twoDigitNum = Integer.valueOf(s.substring(i - 2, i));
            if (oneDigitNum > 0) {
                dp[i] += dp[i - 1];
            }
            if (twoDigitNum >= 10 && twoDigitNum <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}