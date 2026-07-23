class Solution {
    public int evalRPN(String[] tokens) {
        List<String> list = new ArrayList<>(Arrays.asList(tokens));

        return evaluateR(list);
    }
    public int evaluateR(List<String> list){
        String val = list.remove(list.size()-1);
        if(!("+-*/".contains(val))){
            return Integer.parseInt(val);
        }

        int right = evaluateR(list);
        int left = evaluateR(list);

        if(val.equals("+")){
            return left+right;
        }
        else if(val.equals("-")){
            return left-right;
        }
        else if(val.equals("*")){
            return left*right;
        }
        return left/right;
    }
}
