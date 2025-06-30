class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int res=-1;
        int max=Integer.MIN_VALUE;
        for(int n:map.keySet()){
            if(n%2==0 && max<map.get(n)){
                max=map.get(n);
                res=n;
            }
        }
        return res;
    }
}