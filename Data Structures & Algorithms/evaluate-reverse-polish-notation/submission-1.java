class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s : tokens){
            if(Character.isDigit(s.charAt(s.length()-1))){
                stack.push(Integer.parseInt(s));
                System.out.println(stack.peek());
            }
            else{
                int v1 = stack.pop();
                
                int v2 = stack.pop();
                System.out.println(v2+s+v1);
                switch(s){
                    case "+":{
                        stack.push(v2+v1);
                        break;
                    }
                    case "-":{
                        stack.push(v2-v1);
                        break;
                    }
                    case "*":{
                        stack.push(v2*v1);
                        break;
                    }
                    case "/":{
                        stack.push(v2/v1);
                        break;
                    }
                }

            }
        }
        return stack.peek();
    }
}
