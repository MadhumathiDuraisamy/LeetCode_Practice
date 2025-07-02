class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2; 
                    }
                }
            }
        }

        return perimeter;
    //     int r=grid.length;
    //     int c=grid[0].length;
    //     int pm=0;
    //     for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             if(grid[i][j]==1){
    //                 pm+=dfs(grid,i,j);
    //             }
    //         }
    //     }
    //     return pm;
    // }
    // public int dfs(int[][] grid,int i,int j){
    //     int r=grid.length;
    //     int c=grid[0].length;
    //     if(i<0||i>=r||j<0||j>=c||grid[i][j]==0) return 1;
    //     if(grid[i][j]==2) return 0;
    //     grid[i][j]=2;
    //     int m=0;
    //     m+=dfs(grid,i+1,j);
    //     m+=dfs(grid,i-1,j);
    //     m+=dfs(grid,i,j+1);
    //     m+=dfs(grid,i,j-1);
    //     return m;
    }
}