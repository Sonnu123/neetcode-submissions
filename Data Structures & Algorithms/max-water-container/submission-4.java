class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        int ans = 0;
        while(left<right){
            max = (right-left)*Math.min(heights[right],heights[left]);
            if(heights[left]<=heights[right]){
                left++;
            }
            else{
                right--;
            }
            ans = Math.max(ans,max);
        }
        return ans;

    }
}
