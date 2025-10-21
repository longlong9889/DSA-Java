class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
        int count = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            int end = intervals[i][1];
            int begin = intervals[i + 1][0];
            if (end > begin) {
                count++;
                intervals[i + 1][1] = intervals[i][1];
                intervals[i + 1][0] = intervals[i][0];
            }
        }
        return count;
    } 
}