class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = 0;
        int greatest = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            if(sum >= 0){
                max = Math.max(max,sum);
            }
            else{
                sum = 0;
            }
            greatest = Math.max(nums[i], greatest);
        }
        if(max > 0){
            return max;
        }
        return greatest;
    }
}
