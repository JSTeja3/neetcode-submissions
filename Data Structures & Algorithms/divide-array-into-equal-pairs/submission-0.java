class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2 != 0){
            return false;
        }
        Arrays.sort(nums);
        int v = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                v = nums[i];
            }
            else{
                if(v!=nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
}