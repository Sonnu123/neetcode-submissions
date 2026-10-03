class Solution {
    Set<Integer> visited = new HashSet<>();
    List<List<Integer>> list = new ArrayList<>();
    boolean ans = true;
    public boolean validTree(int n, int[][] edges) {
        for(int i = 0; i<n; i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        dfs(list, -1, 0);
        if(visited.size() == n){
            return ans;
        }
        return false;
    }
    public void dfs(List<List<Integer>> list, int parent, int i){

        if(visited.contains(i)){
            ans = false;
            return;
        }
        visited.add(i);
        for(int k : list.get(i)){
            if(k == parent){
            continue;
        }
            dfs(list, i, k);
        }
    }
}
