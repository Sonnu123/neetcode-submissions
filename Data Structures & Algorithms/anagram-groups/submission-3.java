class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i<strs.length; i++){
            String bum = strs[i];
            char[] b = bum.toCharArray();
            Arrays.sort(b);
            String a = new String(b);
            if(map.containsKey(a)){
                map.get(a).add(bum);
            }
            else{
                map.put(a, new ArrayList<>(List.of(bum)));
            }
        }
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}
