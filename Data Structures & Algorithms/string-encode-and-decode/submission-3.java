class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String str : strs){
            encode.append(str.length()).append('#').append(str);
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            StringBuilder length = new StringBuilder();
            while(str.charAt(i) != '#'){
                length.append(str.charAt(i++));
            }
            i++;
            int len = Integer.parseInt(length.toString());
            result.add(str.substring(i,i+len));
            i=i+len;
        }
        return result;

    }
}
