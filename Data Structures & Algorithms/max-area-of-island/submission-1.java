class Solution {
    int ans = 0;
    int betterans;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i<grid.length; i++){
            for(int k = 0; k<grid[0].length; k++){
                if(grid[i][k] == 1){
                    ans = 0;
                    dfs(grid, i, k);
                    betterans = Math.max(ans, betterans);
                }
            }
        }
        return betterans;
    }

    public void dfs(int[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0){
            return;
        }
        grid[row][col] = 0;
        ans++;

        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col-1);
        dfs(grid, row, col+1);
        
    }
}
