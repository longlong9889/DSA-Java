class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 1) return 1;
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> ans = new Stack<>();
        for (int[] car: cars) {
            int pos = car[0];
            int spe = car[1];
            double timeTaken = (double)(target - pos) / spe;
            if (ans.isEmpty() || timeTaken > ans.peek()) {
                ans.push(timeTaken);
            }
        }
        return ans.size();
    }
}