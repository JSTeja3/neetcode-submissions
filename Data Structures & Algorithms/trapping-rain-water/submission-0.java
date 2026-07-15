class Solution {
    public int trap(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            int l = height[i];
            int r = height[i];
            for (int j = i - 1; j >= 0; j--) {
                l = Math.max(l, height[j]);
            }
            for (int j = i + 1; j < height.length; j++) {
                r = Math.max(r, height[j]);
            }

            max += (Math.min(l,r) - height[i]);
        }
        return max;
    }
}
