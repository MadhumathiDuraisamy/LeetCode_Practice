class Solution {
    public int findComplement(int n) {
        int res=0;
        int p=0;
        while(n!=0){
            if((n&1)==0){
                res+=(int)(Math.pow(2,p));
            }
            p++;
            n=n>>1;
        }
        return res;
    }
}