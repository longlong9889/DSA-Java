class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }
        int num1 = 0; int num2 = 0;
        for (int i = 0; i < stones.length; i++) {
            if (pq.size() <= 1) {
                break;
            }
            num1 = pq.poll();
            num2 = pq.poll();
            pq.add(num1 - num2);
        }
        return pq.poll();
    }
}