class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int difference = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) <= difference) {
                if (Math.abs(arr[i] - arr[i + 1]) < difference) {
                    list.clear();
                }
                difference = Math.abs(arr[i] - arr[i + 1]);
                List<Integer> listNum = new ArrayList<>();
                listNum.add(arr[i]);
                listNum.add(arr[i + 1]);
                list.add(listNum);
            }
        }
        return list;
    }
}