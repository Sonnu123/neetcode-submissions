class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int i : map.keySet()){
            heap.add(new int[]{i, map.get(i)});
        }
        int u = 0;
        int[] ans = new int[k];
        while(u < k){
            int[] b = heap.poll();
            int a = b[0];
            ans[u] = a;
            u++;
        }
        return ans;

    }
}
