class KthLargest {

PriorityQueue<Integer> minheap = new PriorityQueue<>();
int k = 0;


    public KthLargest(int k, int[] nums) {
        this.k = k;
        minheap = new PriorityQueue<>();
        for (int num : nums) {
            minheap.offer(num);
            if (minheap.size() > k) {
                minheap.poll();
            }
        }

    }
    
    public int add(int val) {
        minheap.offer(val);
        if(minheap.size() > k){
            minheap.poll();
            return minheap.peek();
        }
        
        return minheap.peek();
        
    }
}
