class Solution {
    public boolean hasAlternatingBits(int n) {
        int val=-1;
        while(n>0){
            if((n&1) == val){
                return false;
            }
            val=(n&1);
            n=n>>1;
        }
        return true;
    }
}