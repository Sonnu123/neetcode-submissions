class Solution {
    public int maxArea(int[] heights) {
        int a = 0;
        int curr = 0;
        for(int i = 0; i < heights.length; i++){
            for(int k = 0; k < heights.length; k++){
                a = Math.min(heights[i],heights[k]);
                curr = Math.max(curr, a * Math.abs(k-i));
            }
        }
        return curr;
    }
}
