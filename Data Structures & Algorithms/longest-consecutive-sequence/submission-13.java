class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int ans = 1;
        int count = 0;
        int a = 0;
        for(int i : set){
            ans = 1;
            if(!set.contains(i-1)){
                a = i;
                while(set.contains(a+1)){
                ans++;
                a = a+1;
                }
            }
            count = Math.max(ans,count);
        }
        if(count == 1 && nums.length == 0){
            return 0;
        }
        return count;
    }
}
