class Solution {
    public int characterReplacement(String s, int k) {
        char[] str = s.toCharArray();
        int left = 0;
        int most = 0;
        Map<Character, Integer> bub = new HashMap<>();
        for(int right = 0; right<str.length; right++){
            bub.put(str[right], bub.getOrDefault(str[right],0)+1);
            while((right-left+1)-Collections.max(bub.values()) > k){
                bub.put(str[left], bub.get(str[left])-1);
                left++;
            }
            most = Math.max(most, right-left+1);
        }
        return most;
    }
}
