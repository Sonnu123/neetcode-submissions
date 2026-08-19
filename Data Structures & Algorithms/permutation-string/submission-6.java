class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        int k = str1.length;
        Arrays.sort(str1);
        char[] str2 = s2.toCharArray();
        for(int i = 0; k<=str2.length; i++){
            String str = s2.substring(i,k);
            char[] b = str.toCharArray();
            Arrays.sort(b);
            if(Arrays.equals(b,str1)){
                return true;
            }
            else{
                k++;
            }
        }
        return false;
    }
}
