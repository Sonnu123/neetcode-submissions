class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int[] current = new int[2];
        current = intervals[0];
        for(int i = 1; i<intervals.length; i++){
            int[] a = intervals[i];
            if(a[0] < current[1] || a[0] == current[1]){
                current[1] = Math.max(a[1],current[1]);
            }
            else{
                list.add(new int[]{current[0],current[1]});
                current = a;
            }
        }
        list.add(current);
        int[][] ans = new int[list.size()][2];
        int i = 0;
        for(int[] a : list){
            ans[i][0] = a[0];
            ans[i][1] = a[1];
            i++;
        }
        return ans;

    }
}
