class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int left = 0;
        int right = 0;
        int length = nums1.length+nums2.length;
        int temp = 0;
        for(int i = 0; i<length; i++){
            if(left<nums1.length && right<nums2.length){
                if(nums1[left]<=nums2[right]){
                    arr[i] = nums1[left];
                    left++;
                }
                else{
                    arr[i] = nums2[right];
                    right++;
                }
            }
            else{
                temp = i;
                break;
            }
        }
        while(left<nums1.length){
            arr[temp] = nums1[left];
            left++;
            temp++;
        }
        while(right<nums2.length){
            arr[temp] = nums2[right];
            right++;
            temp++;
        }
        if(arr.length % 2 == 0){
            return (double)(arr[arr.length/2]+arr[arr.length/2-1])/2;
        }
        else{
            return (double)arr[arr.length/2];
        }
    }
}
