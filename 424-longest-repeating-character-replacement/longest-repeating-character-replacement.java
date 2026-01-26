class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] arr = new int[26];
        int maxFreq = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(right) - 'A']);
            int length = right - left + 1;
            if (length - maxFreq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            length = right - left + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}