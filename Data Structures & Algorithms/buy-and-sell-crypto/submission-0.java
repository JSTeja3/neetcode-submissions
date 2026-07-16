class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int n = prices.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                result = Math.max(result, prices[j]-prices[i]);
            }
        }
        return result;
    }
}
