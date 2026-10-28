class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set = new HashSet<>();
       int left = 0;
       char[] c = s.toCharArray();
       int max = 0;
       for(int right = 0; right < c.length; right++){
        while(!set.isEmpty() && set.contains(c[right])){
            set.remove(c[left]);
            left++;
        }
        set.add(c[right]);
        max = Math.max(max, right-left+1);
       }
       return max;
       
    }
}
