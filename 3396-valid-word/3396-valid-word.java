class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        word=word.toLowerCase();
        int v=0,c=0;
        for(char ch:word.toCharArray()){
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v=1;
                else c=1;
            }
            else if(ch>='0' && ch<='9') continue;
            else {
                return false;
            }
        }
        return v==1 && c==1;
    }
}