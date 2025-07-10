class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for(String st:words){
            if(s.startsWith(st)) cnt++;
        }
        return cnt;
    }
}