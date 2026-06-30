class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String sKey = frequencyString(s);
            if(!map.containsKey(sKey)){
                map.put(sKey, new ArrayList<>());
            }
            map.get(sKey).add(s);
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
    public String frequencyString(String s){
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        return Arrays.toString(count);
    }
}
