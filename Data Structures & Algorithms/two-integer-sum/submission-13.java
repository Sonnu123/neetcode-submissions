class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference) && i != map.get(difference)){
                if(i<map.get(difference)){
                    return new int[]{i,map.get(difference)};
                }
                else if(map.get(difference) < i){
                    return new int[]{map.get(difference),i};
                }
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
