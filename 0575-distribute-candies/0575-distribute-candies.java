class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s=new HashSet<>();
        for(int i:candyType){
            s.add(i);
        }
        int l=candyType.length/2;
        int size=s.size();
        return size<l?size:l; 
    }
}