class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int countZ = 0;
        for(int v: nums){
            if(v==0){
                countZ++;
            }
            else{
                product *= v;
            }
            
        }
        int[] output = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(countZ>0){
                if(nums[i]==0 && countZ-1==0){
                    output[i] = product;
                }
                else{
                    output[i] = 0;
                }
            }
            else{
                output[i] = product/nums[i];
            }
        }
        return output;
    }
}  
