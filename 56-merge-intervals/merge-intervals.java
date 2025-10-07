class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        int[] first = intervals[0];
        for (int[] interval : intervals) {
            if (interval[0] <= first[1]) {
                first[1] = Math.max(interval[1], first[1]);
            }
            else {
                result.add(first);
                first = interval;
            }
        }
        result.add(first);
        return result.toArray(new int[result.size()][]);
    }
}