class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count1 = findCount(s1);
        int required = unique(count1);
        int p1 = 0;
        int p2 = 0;
        int formed = 0;
        int[] count2 = new int[26];
        while (p2 < s2.length()) {
            int x = s2.charAt(p2) - 'a';
            count2[x]++;
            if (count1[x] == count2[x]) {
                formed++;
            }
            if (p2 - p1 + 1 < s1.length()) {
                p2++;
                continue;
            }

            if (formed == required) {
                return true;
            }
            int y = s2.charAt(p1) - 'a';
            if (count1[y] == count2[y]) {
                formed--;
            }
            count2[y]--;
            p1++;

            p2++;
        }
        return false;
    }
    public int[] findCount(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }
    public int unique(int[] count) {
        int unique = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                unique++;
            }
        }
        return unique;
    }
}
