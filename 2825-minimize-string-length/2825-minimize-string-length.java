class Solution {
    public int minimizedStringLength(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']=1;
        }
        int l=0;
        for(int i=0;i<26;i++){
            if(freq[i]==1) l++;
        }
        return l;
    }
}