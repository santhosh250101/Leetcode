class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[] dp = new int[n];
        int finalAns = 0;
        for(int i=0;i<n;i++){
            if(i==0){
                dp[i]=1;
            }
            else
            {
                int curr = nums[i];
                int ans = 0;
                for(int j=0;j<i;j++){
                    if(nums[j]<curr){
                        ans= Math.max(ans,dp[j]);
                    }
                }
                dp[i] = 1+ans;
            }
            finalAns = Math.max(finalAns,dp[i]);
        }
        return finalAns;
    }
    
}