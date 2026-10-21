class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length-1;
        int left = 0;
        int ans = 0;
        while(left<right){
            int area = Math.min(heights[right], heights[left])*(right-left);
            if(heights[right] > heights[left]){
                left++;
            }
            else{
                right--;
            }
            ans = Math.max(area,ans);
        }
        return ans;
    }
}
