class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String st:words){
            str+=st;
            if(str.length()>s.length()) return false;
            if(str.length()==s.length() && str.startsWith(s)){
                return true;
            }
        }
        return false;
    }
}