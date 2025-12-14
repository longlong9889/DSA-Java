class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {                                              //key     value
                map.put(nums[i], i);                                   //i:2        map:    1         2 
            }                                                          //                   0         1
            else {                                                     //                            
                if (Math.abs(map.get(nums[i]) - i) <= k) {            //                            
                    return true;                                       // 
                }
                else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}