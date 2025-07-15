class Solution {
    public boolean digitCount(String num) {
        int nums[]=new int[10];
        int freq[]=new int[10];
        int j=0;
        for(char c:num.toCharArray()){
            freq[c-'0']++;
            nums[j++]=c-'0';
        }
        for(int i=0;i<10;i++){
            if(freq[i]!=nums[i]) return false;
        }
        return true;
    }
}