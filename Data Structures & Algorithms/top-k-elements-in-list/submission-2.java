class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
    
        List<Integer>[] freq = new List[nums.length+1];

        for(int i=0; i<nums.length+1; i++){
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
           freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int j = 0;
        for(int i=nums.length; i>0; i--){
            for(int v : freq[i]){
                result[j++] = v;
                if(j==k){
                    return result;
                }
            }
        }

        return result;


    }
}
