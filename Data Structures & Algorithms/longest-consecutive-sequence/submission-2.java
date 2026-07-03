class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int v : nums){
            set.add(v);
        }
        for(int v : set){
            if(!set.contains(v-1)){
                int c = 1;
                while(set.contains(v+c)){
                    c++;
                }
                result = Math.max(c, result);
            }
        }
        return result;
    }
}
