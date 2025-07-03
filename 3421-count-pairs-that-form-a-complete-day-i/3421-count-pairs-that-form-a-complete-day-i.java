class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int res=0;
        for(int i=0;i<hours.length;i++){
            for(int j=i+1;j<hours.length;j++){
                int h=hours[i]+hours[j];
                if(h%24==0){
                    res++;
                }
            }
        }
        return res;
    }
}