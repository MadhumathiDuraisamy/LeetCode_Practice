class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int i = 0, j = 1;

        while(j < n){
            if(nums[i] != nums[j]){ 
            i++;
            nums[i] = nums[j];
            }

            j++; 

        }

        return i+1; 
        // int j=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[j]=nums[i];
        //         j++;
        //     }
        // }
        // return j;
    }
}