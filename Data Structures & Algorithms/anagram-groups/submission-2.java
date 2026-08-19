class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> zon = new HashMap <>();

        for(int i = 0; i < strs.length; i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String str = new String(s);
            if(zon.containsKey(str) == false){
                zon.put(str, new ArrayList<>());
            }
            zon.get(str).add(strs[i]);
        }
        return new ArrayList<>(zon.values());
    }
}
