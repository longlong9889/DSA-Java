class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String anagram = Arrays.toString(arr);
            if (!map.containsKey(anagram)) {
                map.put(anagram, new ArrayList<>());
            }
            map.get(anagram).add(str);
        }
        List<List<String>> listOfAnagrams = new ArrayList<>();
        for (List<String> value: map.values()) {
            listOfAnagrams.add(value);
        }
        return listOfAnagrams;
    }
}