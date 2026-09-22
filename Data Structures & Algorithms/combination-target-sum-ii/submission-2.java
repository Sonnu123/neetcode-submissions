class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }

    public void backtracking(int[] candidates, int target, int start, int sum, List<Integer> path){
        if(sum == target){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i = start; i<candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            path.add(candidates[i]);
                backtracking(candidates, target, i+1, sum+candidates[i], path);
                path.remove(path.size()-1);
        }
    }
}
