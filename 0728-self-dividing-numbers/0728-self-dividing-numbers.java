class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isdivisible(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isdivisible(int n){
        int num=n;
        if(num%10==0){
            return false;
        }
        while(n!=0){
            int d=n%10;
            if(d==0||num%d!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}