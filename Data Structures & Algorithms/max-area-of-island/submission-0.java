class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 1){
                    ans = Math.max(ans,dfs(grid, row, col));
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, int row, int col){
        int ans = 0;
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){
            return 0;
        }

        if(grid[row][col] != 1){
            return 0;
        }

        grid[row][col] = 0;
        ans = 1;

        ans += dfs(grid, row+1, col);
        ans += dfs(grid, row-1, col);
        ans += dfs(grid, row, col+1);
        ans += dfs(grid, row, col-1);

        return ans;

    }
}
