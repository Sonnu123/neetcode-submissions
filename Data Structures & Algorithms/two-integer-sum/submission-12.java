class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> bub = new HashMap<>();
        int[] ans = new int[2];
        int needed = 0;
        for(int i = 0; i < nums.length; i++){
            bub.put(nums[i],i);
        }
        for(int k = 0; k<nums.length; k++){
            needed = target-nums[k];
            if(bub.containsKey(needed) && bub.get(needed) != k){
                ans[0] = k;
                ans[1] = bub.get(needed);
                return ans;
            }

        }
        return ans;
    }
}
