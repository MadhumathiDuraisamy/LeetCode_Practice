class Solution {
    public int search(int[] nums, int target) {
        // int low=nums[0];
        // int high=nums.length-1;
        // while(low<=high){
        //     int mid=low+high/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;

        }
    }