class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int first = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[first] == nums[i]){
                return nums[first];
            }
            else{
                first++;
            }
        }
        return -1;
    }
}
