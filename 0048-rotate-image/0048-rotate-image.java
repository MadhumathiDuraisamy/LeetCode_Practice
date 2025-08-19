class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] tmat= new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            int st=0;
            int end=c-1;
            while(st<end){
                int temp=matrix[i][st];
                matrix[i][st]=matrix[i][end];
                matrix[i][end]=temp;
                st++;
                end--;
            }
        }
    }
}