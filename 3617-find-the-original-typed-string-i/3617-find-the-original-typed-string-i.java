class Solution {
    public int possibleStringCount(String word) {
        char[] ch=word.toCharArray();
        int cnt=1;
        for(int i=ch.length-1;i>0;i--){
            if(ch[i]==ch[i-1]){
                cnt++;
            }
        }
        return cnt;
    }
}