class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(strs[i]);
            }
            else{
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                map.put(sortedString, group);
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int v : count){
            if(v!=0){
                return false;
            }
        }
        return true;
    }
}
