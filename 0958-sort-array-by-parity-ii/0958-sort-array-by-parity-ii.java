class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ei=0;
        int oi=1;
        int l=nums.length;
        while(ei<l && oi<l){
            if(nums[ei]%2==0){
                ei+=2;
            }
            else if(nums[oi]%2==1){
                oi+=2;
            }
            else{
                int temp=nums[ei];
                nums[ei]=nums[oi];
                nums[oi]=temp;
                ei+=2;
                oi+=2;
            }
        }
        return nums;
    }
}