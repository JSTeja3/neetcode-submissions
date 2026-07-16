class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int result = 0;
        int[] count = new int[256];
        int p1 = 0;
        int p2 = 0;
        while(p2<s.length()){
            int x = s.charAt(p2);
            count[x]++;
            while(count[x]>1){
                int y = s.charAt(p1);
                count[y]--;
                p1++;
            }
            p2++;
            result=Math.max(result, p2-p1);
        }
        return result;
    }
}
