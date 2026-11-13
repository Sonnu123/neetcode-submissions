class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String a = strs[i];
            char[] c = a.toCharArray();
            Arrays.sort(c);
            String f = new String(c);
            if(!map.containsKey(f)){
                map.put(f, new ArrayList(List.of(a)));
            }
            else{
                map.get(f).add(a);
            }
        }
        return new ArrayList<>(map.values());
    }
}
