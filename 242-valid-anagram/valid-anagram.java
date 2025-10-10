class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char b = t.charAt(i); 
            map.put(b, map.getOrDefault(b, 0) - 1);
            if (map.getOrDefault(b, 0) == 0) {
                map.remove(b);
            }
        }
        if (map.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}