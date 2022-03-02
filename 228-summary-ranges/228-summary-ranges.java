class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans=new ArrayList<>();
        
        int start=0;
        int end=0;
        int n=nums.length;
        for(int i=0;i<n;)
        {
            start=i;
            end=i;
            while(i+1<nums.length && nums[i+1]==nums[i]+1)
            {
                i++;
                end=i;
            }
            
            if(start!=end)
            {
                ans.add(new String(nums[start]+"->"+nums[end]));
            }
            else
            {
                ans.add(new String(nums[start]+""));
            }
            i=end+1;
        }
        return ans;
    }
    
}