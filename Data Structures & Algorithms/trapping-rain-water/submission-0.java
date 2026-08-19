class Solution {
    public int trap(int[] height) {
        if(height.length < 3){
            return 0;
        }

        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        right[height.length-1] = height[height.length-1];
        for(int l = 1; l<height.length; l++){
            left[l] = Math.max(height[l],left[l-1]);
        }
        for(int r = height.length-2; r > -1; r--){
            right[r] = Math.max(height[r], right[r+1]);
        }
        int total = 0;
        for(int i = 0; i<height.length; i++){
            total += Math.min(right[i],left[i])-height[i];
        }
        return total;
    }
}
