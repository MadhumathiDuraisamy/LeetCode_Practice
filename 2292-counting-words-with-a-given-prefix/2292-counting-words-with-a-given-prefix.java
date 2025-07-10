class Solution {
    public int prefixCount(String[] words, String pref) {
        int len=pref.length();
        int cnt=0;
        for(String s:words){
            if(s.length()<len) continue;
            else if(pref.equals(s.substring(0,len))){
                cnt++;
            }
        }
        return cnt;
    }
}