class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp= new int[amount+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<=amount;i++){

            if(i==0){
                dp[i]=0;
                continue;
            }
            int minCoins =Integer.MAX_VALUE;

            for(int coin:coins){
                if(i-coin>=0 && dp[i-coin]!=-1)
                {
                    minCoins = Math.min(minCoins,dp[i-coin]);
                }
            }
            if(minCoins!=Integer.MAX_VALUE){
                if(dp[i]==-1){
                    dp[i]= 1+minCoins;
                }
                else
                {
                    dp[i] = Math.min(dp[i], 1+minCoins);
                }
            }

        }
        return dp[amount];
    }
}