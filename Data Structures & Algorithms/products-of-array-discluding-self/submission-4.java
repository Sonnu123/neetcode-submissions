class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int[] suffix = new int[nums.length];
        int [] ans = new int[nums.length];
        suffix[nums.length-1] = 1;
        for(int i = 1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int k = nums.length-2; k>-1; k--){
            suffix[k] = suffix[k+1] * nums[k+1];
        }
        for(int i = 0; i<nums.length; i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}  
