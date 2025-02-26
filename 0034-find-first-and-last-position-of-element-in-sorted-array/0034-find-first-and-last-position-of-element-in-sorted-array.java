class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int[] res = new int[2];
        int low =-1;
        int high =1;
        int n= arr.length;
        // first index

        int first = -1;
         low =0;
         high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(target<=arr[mid]){
                high = mid-1;
            }
            else
            {
                low =mid+1;
            }
        }
        res[0]= first;
                 low =0;
         high = n-1;
        int last = -1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(target<=arr[mid]){
                high = mid-1;
            }
            else
            {
                low =mid+1;
            }
        }
        res[1] = last;
        return res;

    }
}