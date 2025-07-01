class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;
        // for(int i=0;i<row;i++){
        //     for(int j=i+1;j<cl;j++){
        //         int temp=image[i][j];
        //         image[i][j]=image[j][i];
        //         image[j][i]=temp;
        //     }
        // }
        for(int i=0;i<row;i++){
            int st=0;int end=col-1;
            while(st<end){
                int temp=image[i][st];
                image[i][st]=image[i][end];
                image[i][end]=temp;
                st++;
                end--;
            }
            for(int j=0;j<col;j++){
                if(image[i][j]==1) image[i][j]=0;
                else image[i][j]=1;
            }
        }
        return image;
    }
}