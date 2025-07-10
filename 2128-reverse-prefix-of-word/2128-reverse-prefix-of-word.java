class Solution {
    public String reversePrefix(String word, char ch) {
        char[] carr=word.toCharArray();
        for(int i=0;i<carr.length;i++){
            if(carr[i]==ch){
                reverse(0,i,carr);
                return new String(carr);
            }
        }
        return new String(carr);
    }
    public void reverse(int st,int end,char[] ch){
        while(st<end){
            char temp=ch[st];
            ch[st]=ch[end];
            ch[end]=temp;
            st++;
            end--;
        }
    }
}