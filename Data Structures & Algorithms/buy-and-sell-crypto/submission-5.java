class Solution {
    public int maxProfit(int[] prices) {


            /* optimized sliding window*/

        int max = 0;
        int profit = 0;
        int lowestBuy = prices[0];

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < lowestBuy){
                lowestBuy = prices[i];
            }

            profit = prices[i] - lowestBuy;

            if(profit > max){
                max = profit;
            }
            
        }

        return max;
        
    }
}
