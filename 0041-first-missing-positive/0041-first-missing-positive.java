class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean []present= new boolean[n+1];

        for(int val : nums){
            if(val>0 && val<=n){
                present[val]=true;
            }
        }


        for(int i=1; i<=n; i++){
            if(!present[i]){
                return i;
            }
        }
        return n+1;
        // HashSet<Integer> hashset=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         hashset.add(nums[i]);
        //     }
        // }
        // for(int i=1;i<nums.length+1;i++){
        //     if(!hashset.contains(i)){
        //         return i;
        //     }
        // }
        // return nums.length+1;
    }
}