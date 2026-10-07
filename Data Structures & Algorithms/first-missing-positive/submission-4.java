class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            set.add(nums[i]);
        }
        if(max == Integer.MAX_VALUE){
            max = max-2;
        }
        for(int i = 0; i<max+2; i++){
            if(!set.contains(i) && i>0){
                return i;
            }
        }
        return 1;
    }
}