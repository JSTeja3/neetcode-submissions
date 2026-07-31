class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;
        for(int i=0; i<=heights.length; i++){
            while(!stack.isEmpty() && (i==heights.length || heights[stack.peek()]>heights[i])){
                int h = heights[stack.pop()];
                int l = (stack.isEmpty())?-1:stack.peek();
                int r = i;
                max = Math.max(max, (r-l-1)*h);
            }
            stack.push(i);
        }
        return max;
    }
}
