class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current = 0;
        int start = 0;
        int total = 0;
        for(int i = 0; i<gas.length; i++){
            int diff = gas[i] - cost[i];
            current+=diff;
            total+=diff;
            if(current < 0){
                current = 0;
                start = i+1;
            }

        }
        if(total < 0){
            return -1;
        }
        return start;
    }
}
