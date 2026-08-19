class Solution {
    public int characterReplacement(String s, int k) {
        char[] str = s.toCharArray();
        int ans = 0;
        int left = 0;
        Map<Character,Integer> map  = new HashMap<>();
        for(int i = 0; i<str.length; i++){
            map.put(str[i], map.getOrDefault(str[i],0)+1);
            while(i - left + 1 - Collections.max(map.values()) > k){
                map.put(str[left], map.get(str[left]) - 1);
                left++;
            }
            ans = Math.max(ans, i-left+1);
        }
        if(ans > str.length){
            ans = str.length;
        }
        return ans;
    }
}
