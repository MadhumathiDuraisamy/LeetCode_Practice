class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    public boolean isPalindrome(String word){
        int st=0;
        int end=word.length()-1;
        while(st<end){
            if(word.charAt(st)!=word.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }
}