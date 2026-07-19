class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && map.get(c)==stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
