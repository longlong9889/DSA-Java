class Solution {
    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = 0;
        int remainder = 0;
        while(b != 0 ) {
            sum = a ^ b;
            remainder = a & b;
            a = sum;
            b = remainder << 1;
        }
        return sum;
    }
}