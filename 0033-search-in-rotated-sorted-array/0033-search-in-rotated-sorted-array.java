class Solution {
    public int search(int[] nums, int target) {
        
        // search in rotated sorted array

        /**
        
        0 6


        low = 0;
        high = 6

        mid =3;
        nums[mid] = 7;


        nums[low] =4;
        
        nums[high] =2;

         */

        int n= nums.length;
        int low =0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid] == target){
                return mid;
            }

            // identify the sorted half;

            if(nums[low]<=nums[mid]){

                if(nums[low]<=target && target< nums[mid]){
                    high = mid-1;
                }
                else{
                    low= mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[high]){
                    low= mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;

    }
}