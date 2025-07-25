class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] freq=new int[101];
        int nm=-101;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) freq[nums[i]]=1;
            else{
                if(nums[i]>nm){
                    nm=nums[i];
                }
            }
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(freq[i]==1){
                sum+=i;
            }
        }
        return (sum!=0)?sum:nm;
    }
}