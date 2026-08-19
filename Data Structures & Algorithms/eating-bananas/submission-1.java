class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int j = 0;
        for(int i = 0; i < piles.length; i++){
            j = Math.max(j, piles[i]);
        }
        int right = j;
        int left = 1;
        while(left < right){
            int maxtime = 0;
            int mid = (right+left)/2;
            int k = mid;
            for(int i = 0; i<piles.length; i++){
                maxtime += (piles[i]+mid-1)/mid;
            }
            if(maxtime <= h){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
        
    }
}
