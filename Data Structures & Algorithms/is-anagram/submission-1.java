class Solution {
    public boolean isAnagram(String s, String t) {
        char[] bum = s.toCharArray();
        char[] bummy = t.toCharArray();
        Arrays.sort(bum);
        Arrays.sort(bummy);
        String sf = new String(bum);
        String tf = new String(bummy);
        if(sf.equals(tf)){
            return true;
        }
        return false;
    }
}
