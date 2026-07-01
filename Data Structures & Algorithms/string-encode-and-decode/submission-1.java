class Solution {
    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for (String s : strs) {
            if (s.isEmpty()) {
                encode.append("$");
            }
            for (char c : s.toCharArray()) {
                encode.append((int) c).append("_");
            }
            encode.append("#");
        }

        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        if(str.isEmpty()){
            return decoded;
        }
        for (String enS : str.split("#")) {
            StringBuilder s = new StringBuilder();
            if (enS.equals("$")) {
                s.append("");
            } else {
                for (String ascii : enS.split("_")) {
                    s.append((char) Integer.parseInt(ascii));
                }
            }
            decoded.add(s.toString());
        }
        return decoded;
    }
}
