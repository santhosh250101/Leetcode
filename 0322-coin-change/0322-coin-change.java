class Solution {
    public int coinChange(int[] coins, int amount) {
        
        // minimum steps || min coins as 

        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);

        for(int i=0;i<=amount;i++){
            if(i==0){
                dp[0]=0;
            }
            else
            {
                int minCoins = Integer.MAX_VALUE;

                for(int coin:coins){
                    if(i-coin>=0){
                        if(dp[i-coin]!=-1){
                            minCoins= Math.min(minCoins,dp[i-coin]);
                        }
                    }
                }

                if(minCoins!=Integer.MAX_VALUE){
                    dp[i] = 1+minCoins;
                }
            }
        }
        return dp[amount];
    }
}