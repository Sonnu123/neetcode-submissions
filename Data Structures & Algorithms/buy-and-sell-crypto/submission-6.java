class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int total = 0;
        int best = 0;
        for(int right = 1; right < prices.length; right++){
            total = prices[right]-prices[left];
            if(total >= 0 && total > best){
                best = total;
            }
            if(prices[right] < prices[left]){
                left=right;
            }
        }
        return best;
    }
}
