class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens) {
            switch (s) {
                case "+": {
                    int v1 = stack.pop();
                    int v2 = stack.pop();
                    stack.push(v2 + v1);
                    break;
                }
                case "-": {
                    int v1 = stack.pop();
                    int v2 = stack.pop();
                    stack.push(v2 - v1);
                    break;
                }
                case "*": {
                    int v1 = stack.pop();
                    int v2 = stack.pop();
                    stack.push(v2 * v1);
                    break;
                }
                case "/": {
                    int v1 = stack.pop();
                    int v2 = stack.pop();
                    stack.push(v2 / v1);
                    break;
                }
                default: {
                    stack.push(Integer.parseInt(s));
                    break;
                }
            }
        }
        return stack.pop();
    }
}
