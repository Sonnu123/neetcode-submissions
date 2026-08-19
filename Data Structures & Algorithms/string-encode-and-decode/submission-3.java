class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        int x = 0;
        for(String i : strs){
            x = i.length();
            encoded += (x + "#" + i);
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            int end = start+length;
            decode.add(str.substring(start,end));
            i = end;
        }
        
            
        
        return decode;
    }
}
