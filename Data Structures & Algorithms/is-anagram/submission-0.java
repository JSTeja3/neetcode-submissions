class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        boolean[] exists = new boolean[t.length()];
        for(int i=0; i<s.length(); i++){
            boolean found = false;
            for(int j=0; j<t.length(); j++){
                if(!exists[j] && t.charAt(j)==s.charAt(i)){
                    exists[j] = true;
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}
