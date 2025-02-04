class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];

        for(int i=n;i>=0;i--){
            if(i==n || i== n-1){
                dp[i] = 1;
            }
            else
            {
                dp[i] = dp[i+1] + dp[i+2];
            }
        }
        return dp[0];
    }
}