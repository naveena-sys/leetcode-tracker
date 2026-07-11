// Last updated: 7/11/2026, 2:05:55 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int currentprofit=prices[i]-min;
            if(currentprofit>profit){
                profit=currentprofit;
            }

        }
        return profit;
    }
}