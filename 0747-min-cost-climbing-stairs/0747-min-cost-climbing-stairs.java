class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        // int steps = cost.length;
        // int[] dp = new int[steps+1];

        // for(int i= steps;i>=0;i--){
        //     if(i == steps){
        //         dp[i] =0;
        //     }
        //     else if(i == steps-1){
        //         dp[i] = cost[i];
        //     }
        //     else {
        //         dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
        //     }
        // }
        // return Math.min(dp[0], dp[1]);

        int first = -1;
        int second = -1;
        int steps = cost.length;
        for(int i= steps;i>=0;i--){

            if(i == steps){
                second = 0;
            }
            else if(i == steps-1){
                first= cost[i];
            }
            else{
                int temp = cost[i] + Math.min(first,second);
                second = first;
                first = temp;
                
                
            }
        }
        return Math.min(first,second);
    }
}