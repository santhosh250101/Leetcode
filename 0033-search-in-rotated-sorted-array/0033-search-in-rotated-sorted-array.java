class Solution {
    public int search(int[] nums, int target) {
        
        // during search either one of them is sorted . so check in that sorted array else use other
        int n= nums.length;
        int low =0;
        int high = n-1;

        while(low<=high){

            int mid = (low+high)/2;

            if(nums[mid] == target) return mid;

            // check if left is sorted

            if(nums[low]<=nums[mid]){
                if(nums[low] <= target && target<= nums[mid]){
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<= target && target<= nums[high]){
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return -1;


    }
}