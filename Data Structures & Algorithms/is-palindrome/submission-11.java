class Solution {
    public boolean isPalindrome(String s) {
        char[] b = s.toCharArray();
        int left = 0;
        int right = b.length-1;
        while(left<right){
            if(!Character.isLetterOrDigit(b[left]) || b[left]==' '){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(b[right]) || b[right]==' '){
                right--;
                continue;
            }
            if(Character.toLowerCase(b[left])==Character.toLowerCase(b[right])){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
