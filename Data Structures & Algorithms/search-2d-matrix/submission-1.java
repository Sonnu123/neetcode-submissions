class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl = matrix.length;
        int cl = matrix[0].length;
        int left = 0;
        int right = rl*cl-1;

        while(left<=right){
            int mid = (right+left)/2;
            if(matrix[mid/cl][mid%cl] == target){
                return true;
            }
            else if(matrix[mid/cl][mid%cl] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}
