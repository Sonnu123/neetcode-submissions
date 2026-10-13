class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        int c = 0;
        int endtime = intervals[0][1];
        for(int i = 0; i<intervals.length-1; i++){
            int a1 = intervals[i][0];
            int b1 = intervals[i][1];
            int a2 = intervals[i+1][0];
            int b2 = intervals[i+1][1];
            if(endtime > a2){
                endtime = Math.min(endtime,b2);
                ans++;
            }
            else{
                endtime = b2;
            }
        }
        return ans;
    }
}
