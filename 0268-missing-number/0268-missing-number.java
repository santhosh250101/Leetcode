class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n = nums.length;
        int target = n* (n+1);
        target/=2;
        for(int i:nums){
            sum+=i;
        }
        return target -sum;

    }
}