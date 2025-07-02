class Solution {
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            dfs(board,i,0);
            dfs(board,i,c-1);
        }
        for(int i=0;i<c;i++){
            dfs(board,0,i);
            dfs(board,r-1,i);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='S') board[i][j]='O'; 
            }
        }
    }
    public void dfs(char[][] board,int i,int j){
        int r=board.length;
        int c=board[0].length;
        if(i<0||i>=r||j<0||j>=c||board[i][j]!='O') return;
        board[i][j]='S';
        dfs(board,i+1,j);
        dfs(board,i,j+1);
        dfs(board,i-1,j);
        dfs(board,i,j-1);
    }
}