class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int l=fruits.length;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]!=-1 && fruits[i]<=baskets[j]){
                    baskets[j]=-1;
                    l--;
                    break;
                }
            }
        }
        return l;
    }
}