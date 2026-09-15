class Solution {
    public int maxProfit(int[] prices) {
        int pro=0,i=0;
        while(i<prices.length-1){
            if(prices[i+1]>prices[i]){
                pro+=prices[i+1] - prices[i];
            }
            i++;
        }
        return pro;
    }
}