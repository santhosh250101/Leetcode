class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low=0;
        int high = nums.length-1;
        int ans =-1;
        while(low<=high){
            int mid = low+ (high-low)/2;

            if(nums[mid]==target){
                ans = mid;
                return ans;
            }
            else if(target<nums[mid]){
                ans = mid;
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }

        if(target<nums[0]){
            return 0;
        }
        if(target> nums[nums.length-1]){
            return nums.length;
        }
        return ans;
        /**
        
        1 2 3
         */


    }
}