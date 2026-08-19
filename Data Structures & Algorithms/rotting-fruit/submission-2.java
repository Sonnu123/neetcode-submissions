class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int orangecount = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 2){
                    q.offer(new int[]{row,col});
                }
                else if(grid[row][col] == 1){
                    orangecount++;
                }
            }
        }

        int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        int ans = 0;
        while(!q.isEmpty() && orangecount > 0){
            int ls = q.size();
            for(int i = 0; i<ls; i++){
                int[] position = q.poll();

                int rows = position[0];
                int cols = position[1];

                for(int[] dir : direction){
                    int newrow = rows + dir[0];
                    int newcol = cols + dir[1];

                    if(newrow < 0 || newrow >= grid.length || newcol < 0 || newcol >= grid[0].length || grid[newrow][newcol] != 1){
                        continue;
                    }

                    grid[newrow][newcol] = 2;
                    orangecount--;
                    q.offer(new int[]{newrow,newcol});
                    
                }
            }
            ans++;
        }
        return orangecount == 0 ? ans : -1;
    }
}
