class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long cnt=0;
        for(int i=0;i<nums.length;i++){
            while(i<nums.length && nums[i]==0){
                cnt++;
                i++;
            }
            ans+=(cnt*(cnt+1)/2);
            // System.out.println(cnt);
            cnt=0;
        }
        return ans;
    }
}