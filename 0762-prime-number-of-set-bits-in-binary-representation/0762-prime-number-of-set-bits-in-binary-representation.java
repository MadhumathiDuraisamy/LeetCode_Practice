class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19));
        for(int i=left;i<=right;i++){
            int v=setBitCount(i);
            if(numbers.contains(v)){
                cnt++;
            }
        }
        return cnt;
    }
    public int setBitCount(int n){
        int cnt=0;
        while(n>0){
            if((n&1)==1){
                cnt++;
            }
            n=n>>1;
        }
        return cnt;
    }
}