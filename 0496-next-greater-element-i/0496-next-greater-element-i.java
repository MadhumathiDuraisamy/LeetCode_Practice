class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int ind=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ind=j;
                }
            }
            int val=-1;
            //boolean found=false;
            for(int k=ind;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    //found=true;
                    val=nums2[k];
                    break;
                }
            }
            res[i]=val;
        }
        return res;
    }
}