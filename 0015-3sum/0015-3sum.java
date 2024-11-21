class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){

            //
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k = n-1;

            while(j<k){

                int target = -(nums[i]);

                int sum = nums[j]+nums[k];

                if(sum == target){

                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[j]);
                    sub.add(nums[k]);
                    ans.add(sub);
                    j++;
                    k--;

                    while(j<k && nums[j]== nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]== nums[k+1]){
                        k--;
                    }
                }
                else if(sum<target){
                    j++;
                }
                else
                {
                    k--;
                }
            }


        }
        
        return ans;
    }
}