class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for(int v : nums){
            map.put(v, map.getOrDefault(v,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new int[]{entry.getKey(), entry.getValue()});
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0; i<k; i++){
            result[i] = pq.poll()[0];
        }
        return result;
    }
}
