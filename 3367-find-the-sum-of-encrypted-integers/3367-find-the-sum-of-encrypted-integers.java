class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=encrypt(nums[i]);
        }
        return res;
    }
    public int encrypt(int n){
        int[] arr={0,1,11,111,1111};
        int cnt=0;
        int max=0; 
        while(n!=0){
            max=Math.max(max,n%10);
            n/=10;
            cnt++;
        }
        return max*arr[cnt];
    }
}