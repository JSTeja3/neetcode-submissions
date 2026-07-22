class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minS;
    public MinStack() {
        stack = new ArrayDeque<>();
        minS = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minS.isEmpty() || val<=minS.peek()){
            minS.push(val);
        }
    }
    
    public void pop() {
        int top = stack.pop();
        if(top==minS.peek())
            minS.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}
