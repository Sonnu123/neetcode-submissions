class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> bub = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(bub.contains(nums[i])){
                return true;
            }
            bub.add(nums[i]);
        }
        return false;
    }
}