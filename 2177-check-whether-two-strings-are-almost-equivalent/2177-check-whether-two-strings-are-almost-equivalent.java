class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int freq[]=new int[26];
        for(int i=0;i<word1.length();i++){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);
            freq[ch1-'a']++;
            freq[ch2-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>3 || freq[i]<-3){
                return false;
            }
        }
        return true;
    }
}