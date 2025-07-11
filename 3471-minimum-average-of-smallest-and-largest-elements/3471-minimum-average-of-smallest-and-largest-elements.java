class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min=Integer.MAX_VALUE;
        int st=0;
        int end=nums.length-1;
        while(st<end){
            int a=nums[st];
            int b=nums[end];
            double val=(a+b)/2.0;
            min=Math.min(val,min);
            st++;
            end--;
        }
        return min;
    }
}