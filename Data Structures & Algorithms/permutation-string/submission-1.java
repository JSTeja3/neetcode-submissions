class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] counts1 = findCount(s1);
        for(int i=0; i<=s2.length()-s1.length(); i++){
            int[] counts2 =findCount(s2.substring(i,i+s1.length()));
            if(compareString(counts1, counts2)){
                return true;
            }
        }
        return false;
    }
    public int[] findCount(String s){
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        return count;
    }
    public boolean compareString(int[] counts1, int[] counts2){
        for(int i=0; i<26; i++){
            if(counts1[i]!=counts2[i]){
                return false;
            }
        }
        return true;
    }

}
