package leetcode;
//Best Time to Buy and Sell Stock.
class Buy {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        int mini=prices[0];

        for(int i=1;i<n;i++){
            int aj_ka_profit=prices[i]-mini;
            ans=Math.max(ans,aj_ka_profit);
            mini=Math.min(mini,prices[i]);
        }
        return ans;
    }
}
