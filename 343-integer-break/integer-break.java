class Solution {
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (n == 4) {
            return 4;
        }
        return calculate(n);
    }
    public static int calculate(int n) {
        if (n == 2) return 2;
        if (n == 3) return 3;
        if (n == 4) return 4;
        int maxPro = 3 * calculate(n - 3);
        return maxPro;
    }
}