class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0 && i>left){
                int temp = nums[left];
                nums[left] = 0;
                nums[i] = temp;
                left++;
                i--;
            }
            if(nums[i] == 2 && i<right){
                int temp = nums[right];
                nums[right] = 2;
                nums[i] = temp;
                right--;
                i--;
            }
        }
    }
}