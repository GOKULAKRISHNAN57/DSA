class Solution {
    public int maxProfit(int[] prices) {

        int small = Integer.MAX_VALUE;
        int profit = 0;
        int net = 0;

        for(int i = 0 ; i < prices.length ; i++){

            if(prices[i] < small){
                small = prices[i];
            }

            if(prices[i] > small){
                profit = prices[i] - small;
            }

            if(net < profit){
                net = profit;
            }

        }

        return net;
    }
}