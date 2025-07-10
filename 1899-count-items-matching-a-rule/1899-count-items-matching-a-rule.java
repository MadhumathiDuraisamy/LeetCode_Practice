class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j;
        if(ruleKey.charAt(0)=='t') j=0;
        else if(ruleKey.charAt(0)=='c') j=1;
        else j=2;
        int cnt=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(j).equals(ruleValue)){
                cnt++;
            }
        }
        return cnt;
    }
}