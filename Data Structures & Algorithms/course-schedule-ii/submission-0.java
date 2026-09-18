class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> indegree = new HashMap<>();
        for(int i = 0; i<numCourses; i++){
            list.add(new ArrayList<>());
            indegree.put(i,0);
        }

        for(int[] p : prerequisites){
            int a = p[0];
            int b = p[1];
            list.get(b).add(a);
            indegree.put(a, indegree.get(a)+1);
        }

        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : indegree.keySet()){
            if(indegree.get(i) == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int a = q.poll();
            ans.add(a);
            for(int neighbor : list.get(a)){
                indegree.put(neighbor, indegree.get(neighbor)-1);
                if(indegree.get(neighbor) == 0){
                    q.add(neighbor);
                }
            }
        }
        if(ans.size() != numCourses){
            return new int[0];
        }

        int[] result = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
