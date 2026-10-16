class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String i : strs){
            char[] c = i.toCharArray();
            Arrays.sort(c);
            String sort = new String(c);
            if(!map.containsKey(sort)){
                map.put(sort, new ArrayList<>(List.of(i)));
            }
            else{
                map.get(sort).add(i);
            }
        }
        return new ArrayList<>(map.values());
    }
}
