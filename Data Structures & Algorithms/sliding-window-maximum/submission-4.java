class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int[] ans = new int[nums.length-k+1];
        PriorityQueue<Integer> bub = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<k; i++){
            bub.add(nums[i]);
        }
        ans[0] = bub.peek();
        for(int i = 1; i+k<=nums.length; i++){
            bub.remove(nums[i-1]);
            bub.add(nums[i+k-1]);
            ans[i] = bub.peek();
        }
        return ans;
    }
}
