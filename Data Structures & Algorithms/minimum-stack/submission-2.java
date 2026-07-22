class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minS;
    public MinStack() {
        stack = new ArrayDeque<>();
        minS = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int top=(minS.isEmpty())?val:minS.peek();
        stack.push(val);
        minS.push(Math.min(val, top));
    }
    
    public void pop() {
        stack.pop();
        minS.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}
