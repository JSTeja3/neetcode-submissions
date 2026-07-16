class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int n = prices.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                stack.push(prices[i]);
                continue;
            }
            if(stack.peek()>prices[i]){
                stack.pop();
                stack.push(prices[i]);
            }
            else{
                result = Math.max(result, prices[i]-stack.peek());
            }
        }
        return result;
    }
}
