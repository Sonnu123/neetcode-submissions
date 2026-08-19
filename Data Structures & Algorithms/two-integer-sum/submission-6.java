class Solution {
    public int[] twoSum(int[] nums, int target) {
        int needed = 0;
        int [] ans = new int[2];
        Map<Integer, Integer> dud = new HashMap<>();
            for(int i = 0; i<nums.length; i++){
                dud.put(nums[i],i);
            }
        for(int k = 0; k < nums.length; k++){
            needed = target-nums[k];
            if(dud.containsKey(needed) && dud.get(needed) != k){
                ans[0] = k;
                ans[1] = dud.get(needed);
                return ans;
            }
        }
        return ans;
    }
}
