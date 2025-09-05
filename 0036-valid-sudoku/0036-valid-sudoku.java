class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]>='1' && board[i][j]<='9'){
                    boolean flag=isValid(i,j,board,board[i][j]);
                    if(!flag){
                        return flag;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValid(int row,int col,char[][] board,char c){
        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==c) return false;
            if(i!=col && board[row][i]==c) return false;
            int subRow = 3 * (row / 3) + (i / 3);
            int subCol = 3 * (col / 3) + (i % 3);
            if ((subRow != row || subCol != col) && board[subRow][subCol] == c) return false;
        }
        return true;
    }
}