class Solution {
    List<Integer> visited = new ArrayList<>();
    List<Integer> visiting = new ArrayList<>();
    List<List<Integer>> list = new ArrayList<>();
    boolean ans = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            int a = p[0];
            int b = p[1];
            list.get(a).add(b);
        }
        for(int i = 0; i < numCourses; i++){
            if(!visited.contains(i)){
                dfs(i,list);
            }
        }
        return ans;
    }
    public void dfs(int i, List<List<Integer>> list){
        if(visiting.contains(i)){
            ans = false;
            return;
        }
        if(visited.contains(i)){
            return;
        }
        visiting.add(i);
        for(int k : list.get(i)){
            dfs(k, list);
        }
        visiting.remove(Integer.valueOf(i));
        visited.add(i);
    }
}
