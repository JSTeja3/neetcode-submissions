class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int k=0; k<nums.length; k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            int target = -1*nums[k];
            int p1 = k+1;
            int p2 = nums.length-1;
            while(p1<p2){
                if(nums[p1]+nums[p2]==target){
                        List<Integer> group = new ArrayList<>();
                        group.add(nums[p1]);
                        group.add(nums[p2]);
                        group.add(nums[k]);
                        result.add(group);
                        p1++;
                        p2--;
                        while(nums[p1]==nums[p1-1] && p1<p2){
                            p1++;
                        }
                        while(nums[p2]==nums[p2+1] && p1<p2){
                            p2--;
                        }
                }
                else if(nums[p1]+nums[p2]>target){
                    p2--;
                }
                else{
                    p1++;
                }
            }
                
        }


        return result;
    }
}
