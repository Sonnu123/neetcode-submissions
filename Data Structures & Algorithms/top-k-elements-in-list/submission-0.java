class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i : nums){
            num.put(i, num.getOrDefault(i,0)+1);
        }

        List<List<Integer>> bs = new ArrayList<>();
        for(int i = 0; i<=nums.length; i++){
            bs.add(new ArrayList<>());
        }

        for(int key : num.keySet()){
            int freq = num.get(key);
            bs.get(freq).add(key);
        }

        int[] result = new int[k];
        int resultIndex = 0;

        for (int i = bs.size() - 1; i >= 1; i--) {
            for (int value : bs.get(i)) {
                result[resultIndex] = value;
                resultIndex++;

                if (resultIndex == k) {
                    return result;
                }
            }
        }
        return result;

    }
}
