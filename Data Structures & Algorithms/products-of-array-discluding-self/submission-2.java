class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] pl = new int[nums.length];
        int[] pr = new int[nums.length];
        pl[0] = nums[0];
        pr[nums.length-1] = nums[nums.length-1];
        for(int i=1; i<nums.length; i++){
            pl[i] = pl[i-1]*nums[i];
            pr[nums.length-1-i] = pr[nums.length-i]*nums[nums.length-1-i]; 
        }
        for(int i=0; i<nums.length; i++){
            output[i] = ((i-1)>=0?pl[i-1]:1)*((i+1)<nums.length?pr[i+1]:1);
        }
        return output;
    }
}  
