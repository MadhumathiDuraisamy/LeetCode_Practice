class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int c=nums[l-1];
        int d=nums[l-2];
        int a=nums[0];
        int b=nums[1];
        return (c*d)-(a*b);
    }
}