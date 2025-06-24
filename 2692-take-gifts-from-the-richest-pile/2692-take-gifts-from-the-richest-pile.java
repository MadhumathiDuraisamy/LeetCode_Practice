class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            q.add(gifts[i]);
        }
        for(int i=1;i<=k;i++){
            int val=(int)Math.sqrt(q.poll());
            q.add(val);
        }
        long res=0;
        for(long n:q){
            res+=n;
        }
        return res;
    }
}