class Solution {
    Set<Integer> visited = new HashSet<>();
    Set<Integer> visiting = new HashSet<>();
    boolean ans = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<numCourses; i++){
            list.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            int a = p[0];
            int b = p[1];

            list.get(a).add(b);
        }
        for(int i = 0; i<numCourses; i++){
            if(!visited.contains(i)){
                dfs(prerequisites, list, i);
            }
        }
        return ans;
    }
    public void dfs(int[][] p, List<List<Integer>> list, int i){
        if(visiting.contains(i)){
            ans = false;
            return;
        }
        if(visited.contains(i)){
            return;
        }
        visiting.add(i);
        for(int neighbor : list.get(i)){
            dfs(p,list,neighbor);
        }
        visiting.remove(i);
        visited.add(i);
    }
}
