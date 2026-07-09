class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String frequency = countFrequency(strs[i]);
            if(map.containsKey(frequency)){
                map.get(frequency).add(strs[i]);
            }
            else{
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                map.put(frequency, group);
            }
        }
        for(List<String> group : map.values()){
            result.add(group);
        }
        return result;
    }
    public String countFrequency(String str){
        int[] count = new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }

        return Arrays.toString(count);

    }
}
