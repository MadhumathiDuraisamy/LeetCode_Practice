class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int watercapacity=0;
        while(p1<p2){
            int h=Math.min(height[p1],height[p2]);
            int w=p2-p1;
            int max=h*w;
            watercapacity=Math.max(watercapacity,max);
            if(height[p1]<height[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }
        return watercapacity;
    }
}