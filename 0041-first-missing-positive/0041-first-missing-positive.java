class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                hashset.add(nums[i]);
            }
        }
        for(int i=1;i<nums.length+1;i++){
            if(!hashset.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}