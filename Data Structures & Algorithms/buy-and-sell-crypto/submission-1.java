class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int n = prices.length;
        int p1 = 0;
        int p2 = 1;
        while(p2<n){
            if(prices[p1]>prices[p2]){
                p1=p2;
            }
            else{
                result = Math.max(result, prices[p2]-prices[p1]);
            }
            p2++;
        }
        return result;
    }
}
