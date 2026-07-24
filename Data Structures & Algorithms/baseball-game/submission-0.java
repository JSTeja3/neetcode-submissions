class Solution {
    public int calPoints(String[] operations) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s : operations){
            switch(s){
                case "+":{
                    int v1 = Integer.parseInt(stack.pop());
                    int v2 = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(v2)); 
                    stack.push(String.valueOf(v1)); 
                    stack.push(String.valueOf(v1+v2)); 
                    break;
                }
                case "C":{
                    stack.pop();
                    break;
                }
                case "D":{
                    int v = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(v));
                    stack.push(String.valueOf(v*2));
                    break;
                }
                default:{
                    stack.push(s);
                    break;
                }
            }
        }
        int res = 0;
        while(!stack.isEmpty()){
            res+=Integer.parseInt(stack.pop());
        }
        return res;
    }
}