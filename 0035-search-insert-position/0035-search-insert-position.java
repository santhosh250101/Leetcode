class Solution {
    public int searchInsert(int[] nums, int target) {
        // find the flloor off te array 
        // such that arr[i]<= target
        //i both sae retun i, else return i+1

        int n= nums.length;
        int low = 0;
        int high = n-1;
        int ans = n-1;

        while(low<= high){

            int mid = (low+high)/2;

            if(nums[mid]<= target){
                ans = mid;
                low= mid+1;
            }
            else
            {
                high = mid-1;
            }
        }

        int floorIndex=  nums[ans]<= target?ans : -1;

        if(floorIndex ==-1){
            return 0;
        }

        return nums[floorIndex] == target ? floorIndex : floorIndex+1;
    }
}