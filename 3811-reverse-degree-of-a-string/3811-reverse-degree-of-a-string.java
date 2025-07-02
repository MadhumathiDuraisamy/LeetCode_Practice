class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=('z'-ch+1);
            res+=(val*(i+1));
        }
        return res;
    }
}