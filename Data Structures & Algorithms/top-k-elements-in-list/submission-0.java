class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int v : nums){
            map.put(v, map.getOrDefault(v, 0)+1);
        }
        for(int i=k-1; i>=0; i--){
            int val = 0;
            int freq = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue()>freq){
                    val = entry.getKey();
                    freq = entry.getValue();
                }
            }
            result[i] = val;
            map.remove(val);
        }
        return result;
    }
}
