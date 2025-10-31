class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res=new int[2];
        int[] freq=new int[nums.length];
        for(int i:nums){
            freq[i]++;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(freq[i]==2) res[j++]=i;
        }
        return res;
    }
}