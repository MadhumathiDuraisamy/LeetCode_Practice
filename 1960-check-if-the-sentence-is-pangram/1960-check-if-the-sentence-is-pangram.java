class Solution {
    public boolean checkIfPangram(String sentence) {
        int freq[]=new int[26];
        for(char ch:sentence.toCharArray()){
            freq[ch-'a']=1;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=1) return false;
        }
        return true;
    }
}