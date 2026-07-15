class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int max = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        int r=height[n-1];
        int l=height[0];
        for(int i=n-1; i>=0; i--){
            if(r>height[i]){
                rightMax[i]=r;
            }
            else{
                r=height[i];
            }
        }
        for(int i=0; i<n; i++){
            if(l>height[i]){
                leftMax[i]=l;
            }
            else{
                l=height[i];
            }
        }
        for(int i=0; i<n; i++){
            if(leftMax[i]==0 || rightMax[i]==0){
                continue;
            }
            max += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return max;
    }
}
