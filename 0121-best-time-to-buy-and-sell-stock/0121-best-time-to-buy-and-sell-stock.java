class Solution {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int profit=0;
        int purchase=0;
        for(int i=1;i<prices.length;i++){
            purchase=prices[i]-b;
            if(prices[i]<b){
                b=prices[i];
            }
            else if(purchase>profit){
                profit=purchase;
            }
        }
        return profit;
    }
}