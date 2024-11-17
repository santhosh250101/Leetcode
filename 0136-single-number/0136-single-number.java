class Solution {
    public int singleNumber(int[] nums) {
        int ans =-1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans = nums[i];
            }
            else
            {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }
}