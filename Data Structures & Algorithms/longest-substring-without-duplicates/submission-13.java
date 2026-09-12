class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] b = s.toCharArray();
        int left = 0;
        int ans = 0;
        for(int i = 0; i<b.length; i++){
            while(!set.isEmpty() && set.contains(b[i])){
                set.remove(b[left]);
                left++;
            }
            ans = Math.max(ans, i-left+1);
            set.add(b[i]);
        }
        return ans;
    }
}
