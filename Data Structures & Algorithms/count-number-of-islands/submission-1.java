class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0; i<grid.length; i++){
            for(int k = 0; k<grid[0].length; k++){
                if(grid[i][k] == '1'){
                    dfs(grid, i, k);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void dfs(char[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';

        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }
}
