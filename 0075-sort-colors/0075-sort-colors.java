class Solution {
    public void sortColors(int[] nums) {
        int[] freq=new int[3];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int i=0;
        while(freq[0]!=0){
            nums[i]=0;
            freq[0]--;
            i++;
        }
        while(freq[1]!=0){
            nums[i]=1;
            freq[1]--;
            i++;
        }
        while(freq[2]!=0){
            nums[i]=2;
            freq[2]--;
            i++;
        }
    }
}