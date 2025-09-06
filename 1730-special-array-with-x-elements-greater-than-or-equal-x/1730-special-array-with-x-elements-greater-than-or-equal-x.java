class Solution {
    public int specialArray(int[] nums) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int x = i+1;

            // check if we have extactly x elemts which are greater than or equakl to x
            // find index in the array where the number is <x
            int count = findAns(nums,x);
            if(count ==x){
                return x;
            }
        }
        return -1;
    }
    public static int findAns(int[] nums, int x){
        int low =0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            
            int mid = (low+ high)/2;
            if(nums[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }

        if(ans == -1){
            return -1;
        }
        return (nums.length-ans);
    }
}