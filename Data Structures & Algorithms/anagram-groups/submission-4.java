class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String b = strs[i];
            char[] c = b.toCharArray();
            Arrays.sort(c);
            String d = new String(c);
            if(!map.containsKey(d)){
                map.put(d, new ArrayList<>(List.of(b)));
            }
            else{
                map.get(d).add(b);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String e : map.keySet()){
            ans.add(map.get(e));
        }
        return ans;
    }
}
