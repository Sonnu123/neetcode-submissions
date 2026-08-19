class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int ans = 0;
        int total = 0;
        for(int i : set){
            ans = 1;
            if(!set.contains(i-1)){
                while(set.contains(i+1)){
                    ans++;
                    i++;
                }
                total = Math.max(ans,total);
            }
        }
        return total;

    }
}
