class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> bum = new HashSet<>();
        int n = 0;
        int curr = 0;
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            bum.add(nums[i]);
        }

        for(int i = 0; i<nums.length; i++){
            if(bum.contains(nums[i] - 1)){
                continue;
            }
            else{
                n = nums[i];
                while(bum.contains(n)){
                    curr++;
                    n++;
                }
            }
            ans = Math.max(ans,curr);
            curr = 0;
        }
        return ans;
    }
}
