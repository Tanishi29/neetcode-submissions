class Solution {
    public int maxProfit(int[] prices) {

      /* array indices are days in a week (forward based only)
      set max profit to 0 
      and j to i + 1 cuz we can only move forward in an array 
      if profit is > maxprofit then maxprofit is profit and return the value
      the default is at 0 if no profit is found 

      */

      int maxProfit = 0; 
      int profit = 0;
      

      for(int i = 0; i < prices.length; i++){
        for(int j = i + 1; j < prices.length; j++){
          profit = prices[j] - prices[i];
          if(profit > maxProfit){
            maxProfit = profit;
          }

        }
      }
      
      return maxProfit;
        
    }
}
