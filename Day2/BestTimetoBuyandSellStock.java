// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int buy_price=prices[0];
        int curr_profit=0;
        int ans=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
            else{
                curr_profit=prices[i]-buy_price;
                ans=Math.max(ans,curr_profit);
            }
        }

        return ans;
    }
}