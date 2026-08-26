class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i<piles.length; i++){
            max = Math.max(piles[i],max);
        }
        
        int left = 1;
        int right = max;
        while(left<right){
            int mid = (right+left)/2;
            int r = 0;
            for(int j = 0; j<piles.length; j++){
                r+=Math.ceilDiv(piles[j],mid);
            }
            if(r <= h){
                right = mid;
            }
            
            else{
                left = mid+1;
            }

        }
        return left;
    }
}
