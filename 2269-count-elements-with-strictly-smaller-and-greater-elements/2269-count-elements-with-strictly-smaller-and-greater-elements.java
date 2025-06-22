class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int cnt=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>min && nums[i]<max){
                cnt++;
            }
        }
        return cnt;
    }
}