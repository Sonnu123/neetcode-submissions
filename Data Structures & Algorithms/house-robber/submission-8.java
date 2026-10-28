class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];

        dp[0] = 0;
        dp[1] = nums[0];

        for(int i = 2; i<nums.length+1; i++){
            dp[i] = Math.max(nums[i-1] + dp[i-2],dp[i-1]);
        }
        for(int i = 0; i<nums.length+1; i++){
            System.out.println(dp[i]);
        }
        return dp[dp.length-1];
    }
}
