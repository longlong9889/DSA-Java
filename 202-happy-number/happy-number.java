class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = remainder(n);
        }
        return n == 1;
    }
    private int remainder(int n) {
        int num = 0;
        while (n > 0) {
            num += (n % 10) * (n % 10);
            n = n / 10;
        }
        return num;
    }
}