class Solution {
    int ans = 0;
    public int numIslands(char[][] grid) {
        for(int i = 0; i<grid.length; i++){
            for(int k = 0; k<grid[0].length; k++){
                if(grid[i][k] == '1'){
                    ans++;
                    dfs(grid, i, k);
                }
            }
        }
        return ans;
    }

    public void dfs(char[][] grid, int row, int col){
        if(row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1 || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';

        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }
}
