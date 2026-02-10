class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cheapest = new int[n];
        Arrays.fill(cheapest, Integer.MAX_VALUE);
        cheapest[src] = 0;
        for (int i = 0; i <= k; i++) {
            int[] copy = Arrays.copyOf(cheapest, n);
            for (int[] flight: flights) {
                int s = flight[0];
                int d = flight[1];
                int cost = flight[2];
                if (cheapest[s] == Integer.MAX_VALUE) {
                    continue;
                }
                if (cheapest[s] + cost < copy[d]) {
                    copy[d] = cheapest[s] + cost;
                }
            }
            cheapest = copy;
        }
        if (cheapest[dst] == Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return cheapest[dst];
        }
    }
}