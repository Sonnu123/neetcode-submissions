class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<nums.length; i++){
            heap.add(nums[i]);
        }
        int i = 0;
        int ans = 0;
        while(i<k){
            ans = heap.poll();
            i++;
        }
        return ans;
    }
}
