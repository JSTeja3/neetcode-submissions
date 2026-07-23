class Solution {
    private class Node {
        String data;
        Node prev;
        Node next;
        public Node(String data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }
    public int evalRPN(String[] tokens) {
        Node head = new Node(tokens[0]);
        Node cur = head;
        for (int i = 1; i < tokens.length; i++) {
            Node n = new Node(tokens[i]);
            cur.next = n;
            n.prev = cur;
            cur = n;
        }
        int res = 0;
        while (head != null) {
            if("+-*/".contains(head.data)){
                int l = Integer.parseInt(head.prev.prev.data);
                int r = Integer.parseInt(head.prev.data);
                int ans = 0;

                if(head.data.equals("+")){
                    ans = l+r; 
                }
                else if(head.data.equals("-")){
                    ans = l-r;
                }
                else if(head.data.equals("*")){
                    ans = l*r;
                }
                else{
                    ans = l/r;
                }
                head.data = String.valueOf(ans);
                head.prev = head.prev.prev.prev;
                if(head.prev!=null){
                    head.prev.next = head;
                }
            }
            res = Integer.parseInt(head.data);
            head = head.next;
        }
        return res;
    }
}
