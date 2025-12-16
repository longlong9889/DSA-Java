class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int[] arr = new int[26];
        int maxWindow = 0;
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(right) - 'A']);
            int windowLength = right - left + 1;
            if (windowLength - maxFreq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            windowLength = right - left + 1;
            maxWindow = Math.max(maxWindow, windowLength);
        }
        return maxWindow;
    }
}