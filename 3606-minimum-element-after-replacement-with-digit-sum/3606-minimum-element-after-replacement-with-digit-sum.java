class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                nums[i]=digsum(nums[i]);
            }
            min=Math.min(nums[i],min);
        }
        return min;
    }
    public int digsum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}