class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        char[] strt = t.toCharArray();
        char[] strs = s.toCharArray();

        for(int i = 0; i<strt.length; i++){
            map1.put(strt[i], map1.getOrDefault(strt[i],0)+1);
        }

        int left = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";
        for(int right = 0; right < strs.length; right++){
            if(map1.containsKey(strs[right])){
                map2.put(strs[right], map2.getOrDefault(strs[right],0)+1);
            }
            while(isgood(map1,map2)){
                if(map1.containsKey(strs[left])){
                    map2.put(strs[left], map2.get(strs[left])-1);
                }
                if(right-left < min){
                    min = right-left;
                    ans = s.substring(left,right+1);
                }
                left++;
            }
        }
        return ans;
    }

    public boolean isgood(Map<Character, Integer> map1, Map<Character, Integer> map2){
        for(char b : map1.keySet()){
            if(map2.containsKey(b)){
                if(map2.get(b) >= map1.get(b)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
