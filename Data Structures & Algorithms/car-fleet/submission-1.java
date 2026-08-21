class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] z = new int[position.length][2];
        for(int i = 0; i<position.length; i++){
            z[i][0] = position[i];
            z[i][1] = speed[i];
        }
        Arrays.sort(z, (a,b) -> Integer.compare(a[0],b[0]));
        Deque<Double> stack = new ArrayDeque<>();

        for(int i = 0; i<position.length; i++){
            double time = (double)(target-z[i][0])/z[i][1];
            stack.push(time);
        }
        int ans = 0;
        double max = -1;
        while(!stack.isEmpty()){
            if(stack.peek()>max){
                ans++;
                max = stack.peek();
            }

            stack.pop();
        }
        return ans;
    }
}
