class Solution {
    public int maxProduct(int[] nums) {
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int n:nums){
            q.offer(n);
        }
        int a=q.poll()-1;
        int b=q.poll()-1;
        return a*b;
    }
}