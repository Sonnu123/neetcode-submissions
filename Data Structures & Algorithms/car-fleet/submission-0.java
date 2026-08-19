class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];
        for(int i = 0; i<position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b) -> Integer.compare(b[0],a[0]));

        int[] times = new int[position.length];
        double max = (double)(target - cars[0][0])/cars[0][1];
        int ans = 0;
        for(int i = 1; i<times.length; i++){
            if((double)(target - cars[i][0])/(cars[i][1]) <= max){
                continue;
            }
            else{
                max = (double)(target - cars[i][0])/(cars[i][1]);
                ans++;
            }
        }
        return ans+1;
        
    }
}
