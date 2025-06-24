class Solution {
    public void reverseString(char[] s) {
        int st=0;
        int end=s.length-1;
        while(st<end){
            char ch=s[st];
            s[st]=s[end];
            s[end]=ch;
            st++;
            end--;
        }
        System.out.print(Arrays.toString(s));
    }
}