class KthLargest {
    PriorityQueue<Integer> heap = new PriorityQueue();
    int b = 0;
    public KthLargest(int k, int[] nums) {
        b = k;
        for(int i = 0; i<nums.length; i++){
            heap.add(nums[i]);
        }
        while(heap.size()>k){
            heap.poll();
        }
    }
    
    public int add(int val) {
        heap.add(val);
        while(heap.size()>b){
            heap.poll();
        }
        return heap.peek();
    }
}
