class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            cnt++;
            if(s.charAt(i-1)!=s.charAt(i))  cnt=1;
            if(cnt>2) continue;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}