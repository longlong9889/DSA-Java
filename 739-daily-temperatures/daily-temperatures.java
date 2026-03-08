class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[temperatures.length];
        s.push(temperatures.length - 1);
        for (int i = temperatures.length - 2; i >= 0; i--) {
            while (!s.isEmpty() && temperatures[i] >= temperatures[s.peek()]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                ans[i] = s.peek() - i;
            }
            s.push(i);
        }
        return ans;
    }
}