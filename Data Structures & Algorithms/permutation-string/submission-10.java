class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        char [] b = s1.toCharArray();
        Arrays.sort(b);
        String str1 = new String(b);
        for(int right = s1.length(); right<=s2.length(); right++){
            String str2 = s2.substring(left,right);
            char[] c = str2.toCharArray();
            Arrays.sort(c);
            String str20 = new String(c);
            if(str20.equals(str1)){
                return true;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
