class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        while(left<=right){
            int mid = (right+left)/2;
            if(nums[left] == target){
                return left;
            }
            if(nums[mid] == target){
                return mid;
            }
            if(nums[right] == target){
                return right;
            }
            if(nums[mid] < nums[right]){
                if(target < nums[right] && target > nums[mid]){
                    left = mid+1;
                }
                else{
                    right = mid;
                }
            }
            else{
                if(target > nums[left] && target < nums[mid]){
                    right = mid;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
