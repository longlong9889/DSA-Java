class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); ) {
            int startIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(startIndex));
            for (int j = startIndex + 1; j < endIndex; j++) {
                int currentEndIndex = s.lastIndexOf(s.charAt(j));
                if (endIndex < currentEndIndex) {
                    endIndex = currentEndIndex;
                }
            }
            ans.add(endIndex - startIndex + 1);
            i = endIndex + 1;
        }
        return ans;
    }
}