class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddPalindrome = maxPalindrome(i, i, s);
            int evenPalindrome = maxPalindrome(i, i + 1, s);
            int max = Math.max(oddPalindrome, evenPalindrome);
            if (max > right - left + 1) {
                left = i - (max - 1)/2;
                right = i + max/2;
            }
        }
        return s.substring(left, right + 1);
    }
    private int maxPalindrome(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}