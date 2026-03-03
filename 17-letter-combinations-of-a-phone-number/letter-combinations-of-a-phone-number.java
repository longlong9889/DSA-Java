class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> listOfStrings = new ArrayList<>();
        backtrack(digits, "", listOfStrings, 0, map);
        return listOfStrings;
    }
    private void backtrack(String digits, String current, List<String> res, int index, Map<Character, String> map) {
        if (index == digits.length()) {
            res.add(current);
            return;
        }
        String letters = map.get(digits.charAt(index));
        char[] arr = letters.toCharArray();
        for (char letter: arr) {
            backtrack(digits, current + letter, res, index + 1, map);
        }
    }
}