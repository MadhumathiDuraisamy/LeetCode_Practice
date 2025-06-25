class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int dig=x%10;
            rev=(rev*10)+dig;
            x/=10;
        }
        if(n==rev){
            return true;
        }
        return false;
    }
}