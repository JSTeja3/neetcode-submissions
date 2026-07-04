class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int v : nums){
            if(!map.containsKey(v)){
                map.put(v , map.getOrDefault(v-1, 0)+1+map.getOrDefault(v+1, 0));
                map.put(v-map.getOrDefault(v-1, 0), map.get(v));
                map.put(v+map.getOrDefault(v+1, 0), map.get(v));
                result = Math.max(result, map.get(v));
            }
        }
        
        return result;
    }
}
