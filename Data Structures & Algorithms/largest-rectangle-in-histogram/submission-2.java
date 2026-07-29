class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        Deque<Integer> prev = new ArrayDeque<>();
        Deque<Integer> next = new ArrayDeque<>();
        int[] prevL = new int[n];
        int[] nextL = new int[n];
        //for previous least
        for(int i=0; i<n; i++){
            while(!prev.isEmpty() && heights[prev.peek()]>=heights[i]){
                prev.pop();
            }
            prevL[i] = (prev.isEmpty())?-1:prev.peek();
            prev.push(i);
        }
        for(int i=n-1; i>=0; i--){
            while(!next.isEmpty() && heights[next.peek()]>=heights[i]){
                next.pop();
            }
            nextL[i] = (next.isEmpty())?n:next.peek();
            next.push(i);
        }
        for(int i=0; i<n; i++){
            max = Math.max(max, ((nextL[i]-prevL[i]-1)*heights[i]));
        }
        return max;
    }
    
}
