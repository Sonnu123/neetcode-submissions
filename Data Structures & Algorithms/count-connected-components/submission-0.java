class Solution {
    Set<Integer> set = new HashSet<>();
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> bum = new ArrayList<>();
        int ans = 0;
        for(int i = 0; i<n; i++){
            bum.add(new ArrayList<>());
        }

        for(int[]edge : edges){
            int a = edge[0];
            int b = edge[1];

            bum.get(a).add(b);
            bum.get(b).add(a);
        }

        for(int i = 0; i<n; i++){
            if(!set.contains(i)){
                ans++;
                dfs(bum, i);
            }
        }
        return ans;
    }

    public void dfs(List<List<Integer>> bum, int i){
        if(set.contains(i)){
            return;
        }
        else{
            set.add(i);
        }
        for(int neighbor : bum.get(i)){
            dfs(bum,neighbor);
        }
    }
}
