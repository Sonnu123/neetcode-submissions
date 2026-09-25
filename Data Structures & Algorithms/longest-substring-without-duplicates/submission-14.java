class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] b = s.toCharArray();
        int left=0;
        int ans = 0;
        for(int i = 0; i<b.length; i++){
            while(set.contains(b[i])){
                set.remove(b[left]);
                left++;
            }
            set.add(b[i]);
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
