class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int res=0;
        String[] str=sentence.split(" ");
        for(String s:str){
            if(s.startsWith(searchWord)){
                return res+1;
            }
            res++;
        }
        return -1;
    }
}