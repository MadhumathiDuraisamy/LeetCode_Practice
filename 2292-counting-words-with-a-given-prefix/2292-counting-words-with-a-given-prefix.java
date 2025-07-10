class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words) {
            if(word.startsWith(pref))
                count++;
        }   
        return count;
        // int len=pref.length();
        // int cnt=0;
        // for(String s:words){
        //     if(s.length()<len) continue;
        //     else if(pref.equals(s.substring(0,len))){
        //         cnt++;
        //     }
        // }
        // return cnt;
    }
}