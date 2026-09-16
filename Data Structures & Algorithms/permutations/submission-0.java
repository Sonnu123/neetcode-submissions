class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new ArrayList<>());
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> path){
        if(path.size() == nums.length){
            ans.add(new ArrayList<>(path));
        }
        for(int i = 0; i<nums.length; i++){
            if(!path.contains(nums[i])){
                path.add(nums[i]);
                backtrack(nums, path);
                path.remove(path.size()-1);
            }
        }
    }
}
