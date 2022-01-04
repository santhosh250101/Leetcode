class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum=0;
        int s=0;
        int e=0;
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        while(e<n)
        {
            sum=sum+nums[e];
            
            while(sum>=target && s<=e)
            {
                ans=Math.min(ans,e-s+1);
                sum=sum-nums[s];
                s++;
            }
            e++;
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}