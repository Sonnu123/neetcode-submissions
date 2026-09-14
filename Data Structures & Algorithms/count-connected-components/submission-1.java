class Solution {
    Set<Integer> seen = new HashSet<>();
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];

            list.get(a).add(b);
            list.get(b).add(a);
        }
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(!seen.contains(i)){
                ans++;
                dfs(list, i);
            }
        }
        return ans;

    }

    public void dfs(List<List<Integer>> b, int i){
        if(seen.contains(i)){
            return;
        }
        seen.add(i);

        for(int neighbors : b.get(i)){
            dfs(b,neighbors);
        }
    }
}
