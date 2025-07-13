class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        double ksum=0;
        for(int i=0;i<k;i++){
            ksum+=nums[i];
        }
        max=ksum/k;
        for(int i=k;i<nums.length;i++){
            ksum=ksum+nums[i]-nums[i-k];
            max=Math.max(ksum/k,max);
        }
        return max;
    }
}