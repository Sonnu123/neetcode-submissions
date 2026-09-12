class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i<piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int left = 1;
        int right = max;
        int most = 0;
        while(left<right){
            int mid = (right+left)/2;
            most = 0;
            for(int i = 0; i<piles.length; i++){
                most += Math.ceilDiv(piles[i],mid);
            }
            if(most > h){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}
