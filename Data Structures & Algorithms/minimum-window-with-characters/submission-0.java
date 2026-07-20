class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()){
            return "";
        }

        int min = Integer.MAX_VALUE;
        int[] result = new int[]{0,-1};
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        int p1 = 0;
        int p2 = 0;

        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        }
        int required = tMap.size();
        int formed = 0;

        while(p2<s.length()){
            char c1 = s.charAt(p2);
            sMap.put(c1, sMap.getOrDefault(c1, 0)+1);
            if(sMap.get(c1).equals(tMap.get(c1))){
                formed++;
            }
            while(formed==required){
                if(min>p2-p1+1){
                    min= p2-p1+1;
                    result[0] = p1;
                    result[1] = p2;
                }
                char c2 = s.charAt(p1);
                sMap.put(c2, sMap.get(c2)-1);
                if(sMap.getOrDefault(c2,0)<tMap.getOrDefault(c2,0)){
                    formed--;
                }
                p1++;
            }
            p2++;
        }

        return s.substring(result[0], result[1]+1);
    }
}
