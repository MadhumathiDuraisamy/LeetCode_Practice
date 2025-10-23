class Solution {
    public boolean hasSameDigits(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        while((arr.length-i)!=2){
            for(int j=0;j<arr.length-i-1;j++){
                arr[j]=(char)((arr[j+1]+arr[j])%10);
            }
            i++;
        }
        return arr[0]==arr[1];
    }
}