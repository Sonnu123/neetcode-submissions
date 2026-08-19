class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int j = 0;
        int best = 0;
        Set<Character> bim = new HashSet<>();
        for(int i = 0; i < str.length; i++){
            while(bim.contains(str[i])){
                bim.remove(str[j]);
                j++;
            }

            bim.add(str[i]);
            best = Math.max(best, i-j+1);
        }
        return best;
    }
}
