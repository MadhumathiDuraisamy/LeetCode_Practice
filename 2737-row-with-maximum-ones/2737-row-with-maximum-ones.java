class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res=new int[2];
        res[0]=0;
        res[1]=0;
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>res[1]){
                res[1]=cnt;
                res[0]=i;
            }
        }
        return res;
    }
}