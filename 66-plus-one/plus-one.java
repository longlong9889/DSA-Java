class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[] {1, 0};
            }
            else {
                return new int[] {digits[0] + 1};
            }
        }
        else {
            int n = digits.length - 1;
            if (digits[n] == 9) {
                digits[n] = 0;
                n--;
                while (n >= 0 && digits[n] == 9) {
                    digits[n] = 0;
                    n--;
                }
                if (n < 0) {
                    int[] ans = new int[digits.length + 1];
                    ans[0] = 1;
                    for (int i = 1; i < ans.length; i++) {
                        ans[i] = 0;
                    }
                    return ans;
                }
                else {
                    digits[n] = digits[n] + 1;
                }
            }
            else {
                digits[n] = digits[n] + 1;
            }
        }
        return digits;
    }
}