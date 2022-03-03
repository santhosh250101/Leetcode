class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        
        int s=0,p=0;
        
        
        for(int i=0;i<nums.length-2;i++)
        {
            
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            
            
            if(b-a == c-b)
            {
                p++;
                s+=p;
            }
            else
            {
                p=0;
            }
        }
        
        return s;
    }
}