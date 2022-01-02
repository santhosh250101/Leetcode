class Solution {
    
    //0 means not solved
    //1 means true
    //-1 means false
    public boolean canPartition(int[] nums) {
        // if sum is odd we can't partition into half;
        int sum=0;
        for(int i:nums) sum=sum+i;
        
        if((sum &1) ==1) return false;
        int[][] dp=new int[nums.length][20000+1];
        
        return find(0,sum/2,nums,dp);
    }
    
    private boolean find(int ind,int sum,int[] nums,int[][] dp)
    {
        if(sum==0)
        {
            return true;
        }
        if(sum<0) return false;
        if(ind==nums.length)
        {
            return false;
        }
        if(dp[ind][sum]!=0)
        {
            return (dp[ind][sum]==1)?true:false;
        }
        //pick
        
        boolean pick=   find(ind+1,sum-nums[ind],nums,dp);
        boolean dontPick=find(ind+1,sum,nums,dp);
        
        int ans=(pick | dontPick)==true?1:-1;
        dp[ind][sum]=ans;
        return (ans==1)?true:false;
    }
}