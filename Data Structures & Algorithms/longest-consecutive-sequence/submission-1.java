class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int cons = 1;
        int result = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                cons++;
            }
            else if(nums[i]>nums[i-1]+1){
                result = Math.max(result, cons);
                cons=1;
            }
        }
        result = Math.max(result, cons);
        return result;
    }
}
