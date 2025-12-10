class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            if (!map.containsKey(t.charAt(i))) {
                return false;
            }
            if (map.get(t.charAt(i)) == 0) {
                map.remove(t.charAt(i));
            }
        }
        if (map.isEmpty()) {
            return true;
        }
        return false;
    }
}