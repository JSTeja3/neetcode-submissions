class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s == null){
            return true;
        }
        boolean isPalindrome = true;
        StringBuilder fs = new StringBuilder(); 
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                fs.append(Character.toLowerCase(c));
            }
        }
        return fs.toString().equals(fs.reverse().toString());
    }
}
