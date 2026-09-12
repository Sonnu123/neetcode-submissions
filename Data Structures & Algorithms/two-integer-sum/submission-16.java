class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(!map.isEmpty() && map.containsKey(difference)){
                if(map.get(difference)<i){
                    return new int[] {map.get(difference),i};
                }
                else{
                    return new int[] {i,map.get(difference)};
                }
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
