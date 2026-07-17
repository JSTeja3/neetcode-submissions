class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        
        int p1=0;
        int p2=0;
        int[] count = new int[26];
        int maxRep = 0;
        while(p2<s.length()){
            int x = s.charAt(p2)-'A';
            count[x]++;
            if(count[x]>maxRep){
                maxRep=count[x];
            }
            while(p2-p1+1-maxRep>k){
                int y = s.charAt(p1)-'A';
                count[y]--;
                p1++;
            }
            maxLength= Math.max(maxLength, p2-p1+1);
            p2++;
        }
        return maxLength;
    }
}
