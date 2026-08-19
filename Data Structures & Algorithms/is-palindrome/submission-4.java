class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toLowerCase()
                                    .replaceAll("[^a-z0-9]", "")
                                    .toCharArray();
        int i = str.length-1;
        for(int k = 0; k < i; k++){
            if(str[k] == str[i]){
                i--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
