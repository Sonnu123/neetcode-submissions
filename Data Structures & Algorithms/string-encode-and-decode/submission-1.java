class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(int i = 0; i<strs.size(); i++){
            encoded += strs.get(i) + "..";
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> bub = new ArrayList<>();
        String current = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '.' && str.charAt(i+1) == '.'){
                bub.add(current);
                current = "";
                i++;
            }
            else{
                current += str.charAt(i);
            }
        }
        return bub;
    }
}
