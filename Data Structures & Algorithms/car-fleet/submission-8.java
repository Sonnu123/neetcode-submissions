class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] ans = new int[position.length][2];
        for(int i = 0; i<position.length; i++){
            ans[i][0] = position[i];
            ans[i][1] = speed[i];
        }
        Arrays.sort(ans, (a,b) -> Integer.compare(b[0],a[0]));
        double max = 0;
        int b = 0;
        for(int i = 0; i < position.length; i++){
            double time = (double)(target-ans[i][0])/ans[i][1];
            if(time > max){
                b++;
            }
            max = Math.max(max, time);
        }
        return b;
    }
}
