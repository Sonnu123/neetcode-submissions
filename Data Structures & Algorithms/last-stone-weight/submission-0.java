class Solution {
    public int lastStoneWeight(int[] stones) {
        int ans = 0;
        int x = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<stones.length; i++){
            max.offer(stones[i]);
        }
        while(!max.isEmpty()){
            x = max.poll();
            if(!max.isEmpty()){
                int y = max.poll();
                int z = Math.abs(x-y);
                max.offer(z);
            }
        }
        return x;
    }
}
