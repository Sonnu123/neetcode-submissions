class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numberOfRows = matrix.length;
        int numberOfColumns = matrix[0].length;

        int left = 0;
        int right = (numberOfRows * numberOfColumns) - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            int row = middle / numberOfColumns;
            int column = middle % numberOfColumns;

            int middleValue = matrix[row][column];

            if (middleValue == target) {
                return true;
            } 
            
            if (middleValue < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }
}