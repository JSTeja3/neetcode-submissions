class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] temp = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }
        
        Arrays.sort(temp, Comparator.comparingInt(a->a[0]));
        int p1=0;
        int p2= nums.length-1;
        while(p1<p2){
            int sum = temp[p1][0]+temp[p2][0];
            if(sum == target){
                return new int[]{Math.min(temp[p1][1], temp[p2][1]), Math.max(temp[p1][1], temp[p2][1])};
            }
            else if(sum > target){
                p2--;
            }
            else{
                p1++;
            }
        }
        return new int[0];
    }
}
