package Himanshu.ctcci.ArraysAndString;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy + 1;
        int profit = 0;
        while(sell < prices.length) {
            if(prices[sell] < prices[buy]) {
                buy = sell;
                sell += 1;
            }
            else {

                int margin = prices[sell] - prices[buy];
                if(margin > profit) {
                    profit = margin;
                }
                sell += 1;
            }
        }
        return profit;
    }
}
