class Solution {
    public int findFinalValue(int[] nums, int original) {
        //Set<Integer> res=new HashSet<>();
        for(int n:nums){ 
            if(n==original){
                return findFinalValue(nums,original*2);
            }
        }
        return original;
    }
}