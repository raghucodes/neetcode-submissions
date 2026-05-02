class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int[] min = new int[n];
        int profit = 0;
        min[0] = prices[0];
        for(int i=1;i<n;i++) {
            if(min[i-1]>prices[i]) {
                min[i] = prices[i];
            } else {
                min[i] = min[i-1];
            }
        }

        for(int i=0;i<n;i++) {
            if(prices[i]-min[i] > profit){
                profit = prices[i]-min[i];
            }
        }

        return profit;
    }
}
