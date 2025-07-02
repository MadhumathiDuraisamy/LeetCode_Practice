class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        dfs(image,sr,sc,image[sr][sc],color);
        return image;
    }
    public void dfs(int[][] image,int i,int j,int oc,int nc){
        int r=image.length;
        int c=image[0].length;
        if(i<0||i>=r||j<0||j>=c||image[i][j]!=oc) return;
        image[i][j]=nc;
        dfs(image,i+1,j,oc,nc);
        dfs(image,i-1,j,oc,nc);
        dfs(image,i,j+1,oc,nc);
        dfs(image,i,j-1,oc,nc);
    }
}