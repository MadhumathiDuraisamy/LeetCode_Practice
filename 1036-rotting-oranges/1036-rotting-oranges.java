class Solution {
    private boolean isSafe(int i,int j,int m,int n){
        return  (i>=0 && i<m && j>=0 && j<n);
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dirs[][]={{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[] {i,j});
                }
            }
        }
        int time=0;
        while(!q.isEmpty()){
            time++;
            int len=q.size();
            while(len-->0){
                int[] temp=q.poll();
                int r=temp[0];
                int c=temp[1];
                for(int[] dir:dirs){
                    int x=r+dir[0];
                    int y=c+dir[1];
                    if(isSafe(x,y,m,n) && grid[x][y]==1){
                        grid[x][y]=2;
                        q.add(new int[] {x,y});
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return Math.max(0,time-1);
    }
}