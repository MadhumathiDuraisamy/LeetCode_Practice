class Solution {
    public String generateTheString(int n) {
        StringBuilder sb=new StringBuilder();
        if(n%2!=0){
            for(int i=0;i<n;i++){
                sb.append('a');
            }
        }
        else{
            sb.append('b');
            for(int i=0;i<n-1;i++){
                sb.append('a');
            }
        }
        return sb.toString();
    }
}