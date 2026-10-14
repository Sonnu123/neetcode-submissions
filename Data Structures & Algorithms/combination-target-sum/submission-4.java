class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        backtracking(nums, target, 0, 0, new ArrayList<>());
        return ans;
    }

    public void backtracking(int[] nums, int target, int start, int sum, List<Integer> path) {
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }

        if (sum > target) return;

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, target, i, sum + nums[i], path);
            path.remove(path.size() - 1);
        }
    }
}