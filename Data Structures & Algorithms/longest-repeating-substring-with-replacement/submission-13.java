class Solution {
    public int characterReplacement(String s, int k) {
    Map<Character, Integer> map = new HashMap<>();
    char[] str = s.toCharArray();
    int left = 0;
    int ans = 0;
        for(int right = 0; right<str.length; right++){
            map.put(str[right], map.getOrDefault(str[right],0)+1);
            while((right-left+1) - Collections.max(map.values()) > k){
                map.put(str[left], map.get(str[left])-1);
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
    return ans;
    }
}
