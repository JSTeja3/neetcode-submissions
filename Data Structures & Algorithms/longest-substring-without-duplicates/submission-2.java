class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int result = 1;
        for(int i=0; i<s.length(); i++){
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
            }
            result = Math.max(result, set.size());
        }
        return result;
    }
}
