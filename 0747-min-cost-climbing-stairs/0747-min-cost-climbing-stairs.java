class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int steps = cost.length;
        int[] dp = new int[steps+1];

        for(int i= steps;i>=0;i--){
            if(i == steps){
                dp[i] =0;
            }
            else if(i == steps-1){
                dp[i] = cost[i];
            }
            else {
                dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
            }
        }
        return Math.min(dp[0], dp[1]);
    }
}