class Solution {
    public boolean isValid(String s) {
        while(s.length()!=0){
            String t = s.replace("()","").replace("[]","").replace("{}","");
            if(t==s){
                break;
            }
            s=t;
        }
        return s.length()==0;
    }
}
