class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        
        for(int i=0; i<s.length(); i++){
            int[] count = new int[26];
            int maxrep = 0;
            for(int j=i; j<s.length(); j++){
                int x = s.charAt(j)-'A';
                count[x]++;

                if(count[x]>maxrep){
                    maxrep = count[x];
                }
                if(j-i+1-maxrep>k){
                    break;
                }
                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
}
