class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> q=new PriorityQueue<>();
        for(int n:nums){
            q.add(n);
        }
        int res[]=new int[nums.length];
        int i=0;
        while(!q.isEmpty()){
            res[i++]=q.poll();
        }
        return res;
    }
}