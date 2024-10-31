class Solution {
    public int rob(int[] nums) {
        
        if(nums.length ==0) return 0;
        if(nums.length ==1) return nums[0];
        if(nums.length ==2) return Math.max(nums[0],nums[1]);

        List<Integer> part1= Arrays.stream(nums).skip(1).boxed().collect(Collectors.toList());
        List<Integer> part2 = Arrays.stream(nums).limit(nums.length-1).boxed().collect(Collectors.toList());


        return Math.max(findAns(part1),findAns(part2));

    }


    public static int findAns(List<Integer> nums){

        int[] dp = new int[nums.size()];

        for(int i=0;i<nums.size();i++){

            if(i==0){
                dp[i] = nums.get(i);
            }
            else if(i==1){
                dp[i]= Math.max(nums.get(0),nums.get(1));
            }
            else
            {
                dp[i]= Math.max(dp[i-2]+ nums.get(i), dp[i-1]);
            }
        }
        return dp[nums.size()-1];

    }
}