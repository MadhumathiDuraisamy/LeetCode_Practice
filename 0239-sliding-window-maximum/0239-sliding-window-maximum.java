class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        for(int i=0;i<n;i++){
            if(i%k==0){
                prefix[i]=nums[i];
            }
            else{
                prefix[i]=Math.max(prefix[i-1],nums[i]);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==(n-1) ||(i+1)%k==0){
                suffix[i]=nums[i];
            }
            else{
                suffix[i]=Math.max(suffix[i+1],nums[i]);
            }
        }
        int res[]=new int[n-k+1];
        for(int i=0;i<res.length;i++){
            res[i]=Math.max(prefix[i+k-1],suffix[i]);
        }
        return res;
    }
}