class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        findSubset(0,nums,res,new ArrayList<>());
        return res;
    }
    public void findSubset(int ind,int[] nums,List<List<Integer>> res,List<Integer> ds){
        res.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            findSubset(i+1,nums,res,ds);
            ds.remove(ds.size()-1);
        }
    }
}