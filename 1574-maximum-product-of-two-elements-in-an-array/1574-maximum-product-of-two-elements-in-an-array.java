class Solution {
    public int maxProduct(int[] nums) {
        int smax = 01 ;
        int max = -1 ;

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                smax = max ;
                max = nums[i];
            }else if (smax<nums[i]){
                smax = nums[i];

            }
        }
        int ans = (max-1) * (smax-1);
        return ans;
        // int ans = (max-1) * (smax-1);
        // return ans;
        // Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        // for(int n:nums){
        //     q.offer(n);
        // }
        // int a=q.poll()-1;
        // int b=q.poll()-1;
        // return a*b;
    }
}