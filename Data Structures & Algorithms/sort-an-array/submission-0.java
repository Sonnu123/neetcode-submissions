class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> bum = new PriorityQueue<>();
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            bum.offer(nums[i]);
        }
        
            for(int i = 0; i<nums.length; i++){
                ans[i] = bum.poll();
            }
        
        return ans;
    }
}