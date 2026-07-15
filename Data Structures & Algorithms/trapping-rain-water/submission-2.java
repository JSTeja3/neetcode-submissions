class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int result = 0;
        int leftMax = height[0];
        int rightMax = height[n-1];
        int p1 = 0;
        int p2 = n-1;
        while(p1<=p2){
            if(height[p1]<height[p2]){
                leftMax = Math.max(leftMax, height[p1]);
                result += leftMax - height[p1];
                p1++;
            }
            else{
                rightMax = Math.max(height[p2],rightMax);
                result += rightMax-height[p2];
                p2--;
            }
        }
        return result;
    }
}
