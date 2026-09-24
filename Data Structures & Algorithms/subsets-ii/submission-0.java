class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }

    public void backtrack(int[] nums, int start, List<Integer> path){
        ans.add(new ArrayList<>(path));
        for(int i = start; i<nums.length; i++){
            if(i > start && nums[i] == nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            backtrack(nums, i+1, path);
            path.remove(path.size()-1);
        }
    }
}
