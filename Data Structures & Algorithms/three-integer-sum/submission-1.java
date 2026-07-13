class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int k=0; k<nums.length; k++){
            int target = -1*nums[k];
            int p1 = k+1;
            int p2 = nums.length-1;
            while(p1<p2){
                if(nums[p1]+nums[p2]==target){
                        List<Integer> group = new ArrayList<>();
                        int min = Math.min(Math.min(nums[p1], nums[p2]), nums[k]);
                        int max = Math.max(Math.max(nums[p1], nums[p2]), nums[k]);
                        int mid = nums[p1]+nums[p2]+nums[k]-min-max;
                        group.add(min);
                        group.add(mid);
                        group.add(max);
                        set.add(group);
                        p1++;
                        p2--;
                }
                else if(nums[p1]+nums[p2]>target){
                    p2--;
                }
                else{
                    p1++;
                }
            }
                
        }


        return new ArrayList<>(set);
    }
}
