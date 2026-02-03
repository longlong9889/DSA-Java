class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (isAlphaNum(s.charAt(left)) && isAlphaNum(s.charAt(right))) {
                char l = s.charAt(left);
                char r = s.charAt(right);
                if (Character.toLowerCase(l) == Character.toLowerCase(r)) {
                    left++;
                    right--;
                }
                else {
                    return false;
                }
            } 
            else if (isAlphaNum(s.charAt(left)) == false) {
                left++;
            }
            else if (isAlphaNum(s.charAt(right)) == false) {
                right--;
            }
        }
        return true;
    }
    private boolean isAlphaNum(char c) {
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
            return true;
        }
        else return false;
    }
}