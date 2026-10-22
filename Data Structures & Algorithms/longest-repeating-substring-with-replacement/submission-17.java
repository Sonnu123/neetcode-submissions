class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        char[] c = s.toCharArray();
        int ans = 0;
        for(int right = 0; right < c.length; right++){
            map.put(c[right], map.getOrDefault(c[right], 0)+1);
            if((right-left+1) - Collections.max(map.values()) > k){
                map.put(c[left], map.get(c[left]) - 1);
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
