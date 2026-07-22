class MinStack {
    private List<Integer> stack;
    private Deque<Integer> minS;
    public MinStack() {
        stack = new ArrayList<>();
        minS = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(minS.isEmpty() || minS.peek()>=val){
            minS.push(val);
        }
    }
    
    public void pop() {
        System.out.println(stack.get(stack.size()-1)+" "+minS.peek());
        if(stack.get(stack.size()-1).equals(minS.peek())){
            minS.pop();
        }
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minS.peek();
    }
}
