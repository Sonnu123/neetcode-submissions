class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int left = 0;
        int ans = 0;
        for(int right = 0; right < arr.length; right++){
            while(set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }
            ans = Math.max(ans, right-left+1);
            set.add(arr[right]);
        }
        return ans;
    }
}
