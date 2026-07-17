class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map1 = findCount(s1);
        for(int i=0; i<=s2.length()-s1.length(); i++){
            Map<Character, Integer> map2 =findCount(s2.substring(i,i+s1.length()));
            if(Objects.equals(map1, map2)){
                return true;
            }
        }
        return false;
    }
    public Map<Character, Integer> findCount(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return map;
    }
    // public boolean compareString(int[] counts1, int[] counts2){
    //     for(int i=0; i<26; i++){
    //         if(counts1[i]!=counts2[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}
