class Solution {
    public int lengthOfLongestSubstring(String s) {
        int best = 0;
        int left = 0;
        char[] str = s.toCharArray();
        Set<Character> bub = new HashSet<>();
        for(int right = 0; right<str.length; right++){
            while(bub.contains(str[right])){
                bub.remove(str[left]);
                left++;
            }
            bub.add(str[right]);
            best = Math.max(best, right-left+1);
        }
        return best;
    }

}
