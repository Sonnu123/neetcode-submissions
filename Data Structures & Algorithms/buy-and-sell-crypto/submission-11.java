class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxprice = 0;
        for(int right = 0; right<prices.length; right++){
            while(prices[left]>=prices[right] && left<right){
                left++;
            }
            maxprice = Math.max(maxprice, prices[right]-prices[left]);
        }
        return maxprice;
    }
}
