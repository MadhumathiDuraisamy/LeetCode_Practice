class Solution {
    public int myAtoi(String s) {
        long res=0;
        int sign=1;
        int i=0;
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(s.length()>i&&(s.charAt(i)=='-'||s.charAt(i)=='+')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            res=res*10+(int)(s.charAt(i)-'0');
            if(sign==1&&res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if(sign==-1&&((-1*res)<Integer.MIN_VALUE)){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(res*sign);
    }
}