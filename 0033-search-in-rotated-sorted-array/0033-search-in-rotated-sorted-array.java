class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int low=0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            // at each step one part will be sorted
            // so check if target will be in thbat sorted part or not

            if(nums[mid] == target) return mid;

            if(nums[low]<=nums[mid]){
                if(target>= nums[low] && target< nums[mid]){
                    high = mid-1;
                }
                else{
                    low= mid+1;
                }
            }
            else{
                if(target> nums[mid] && target<= nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            
            
        }
        return -1;
    }
}