class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int p1 = 0;
        int p2 = heights.length-1;
        while(p1<p2){
            int area = (p2-p1)*Math.min(heights[p1], heights[p2]);
            max = Math.max(max, area);
            if(heights[p1]<heights[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }
        return max;
    }
}
