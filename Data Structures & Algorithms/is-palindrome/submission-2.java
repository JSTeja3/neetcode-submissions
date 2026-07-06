class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty() ) {
            return true;
        }
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 < p2) {
            while (!Character.isLetterOrDigit(s.charAt(p1))) {
                p1++;

                if (p1 > p2) {
                    return true;
                }
            }
            while (!Character.isLetterOrDigit(s.charAt(p2))) {
                p2--;

                if (p1 > p2) {
                    return true;
                }
            }
            if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
