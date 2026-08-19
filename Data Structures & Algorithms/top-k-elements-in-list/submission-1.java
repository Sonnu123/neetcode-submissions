class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] x = new int[k];
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int i : map.keySet()){
            q.add(new int[]{map.get(i),i});
            if(q.size() > k){
                q.poll();
            }
        }
        for(int i = 0; i<k; i++){
            x[i] = q.poll()[1];
        }
        return x;
    }
}
