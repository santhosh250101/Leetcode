class Solution {
    public int change(int amount, int[] coins) {
        
        // coin change combinations, start with coin so we get combinations.

        int[] dp = new int[amount+1];

        dp[0]=1;
        for(int coin:coins){
            for(int amt=coin;amt<=amount;amt++){

                if(amt-coin>=0){
                    dp[amt]+=dp[amt-coin];
                }
            }
        }

        return dp[amount];
    }
}