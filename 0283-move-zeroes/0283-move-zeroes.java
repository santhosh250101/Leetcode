class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZeroIndex =0;
        int n = nums.length;
        for(int i=0;i<n;i++) {

            if(nums[i]!=0){
                swap(nums,nonZeroIndex,i);
                nonZeroIndex++;
            }
        }

    }
    public void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}