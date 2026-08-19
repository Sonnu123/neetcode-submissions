class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        int a = 0;
        for(int i = 0; i<points.length; i++){
            a = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            heap.add(new int[] {a, points[i][0], points[i][1]});
        }
        int[][] ans = new int[k][2];
        for(int i = 0; i<k; i++){
            int[] current = heap.poll();
            ans[i][0] = current[1];
            ans[i][1] = current[2];
        }
        return ans;

    }
}
