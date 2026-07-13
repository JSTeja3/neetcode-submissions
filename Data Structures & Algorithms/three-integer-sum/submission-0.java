class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        

        for(int k=0; k<nums.length; k++){
            int target = -1*nums[k];
            Set<Integer> findSet = new HashSet<>();
            for(int i=k+1; i<nums.length; i++){
                if(findSet.contains(target-nums[i])){
                        List<Integer> group = new ArrayList<>();
                        int min = Math.min(Math.min(nums[i], target-nums[i]), nums[k]);
                        int max = Math.max(Math.max(nums[i], target-nums[i]), nums[k]);
                        int mid = target+nums[k]-min-max;
                        group.add(min);
                        group.add(mid);
                        group.add(max);
                        set.add(group);
                }
                findSet.add(nums[i]);
            }
                
        }


        return new ArrayList<>(set);
    }
}
