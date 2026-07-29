class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        for(int i=0; i<n; i++){
            int l = i+1;
            int r = n-i;
            for(int j=i+1; j<n; j++){
                if(heights[j]<heights[i]){
                    r = j-i;
                    break;
                }
            }
            for(int j=i-1; j>=0; j--){
                if(heights[j]<heights[i]){
                    l = i-j;
                    break;
                }
            }
            int area = (l+r-1)*heights[i];
            max = Math.max(max, area);
        }
        return max;
    }
    
}
