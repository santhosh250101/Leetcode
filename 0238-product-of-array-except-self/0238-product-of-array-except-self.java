class Solution {
    public int[] productExceptSelf(int[] nums) {
        /**
        
        calculate prefix[i] => product i till i-1;
        calculate suffix[i] => product i from i+1;
        so prduct[i] = prefix[i]* suffix[i];
         */

        // calculation prefix[i];
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // pre compute prefix array

        for(int i=0;i<n;i++){
            if(i==0) prefix[0]=1;
            else{
                prefix[i] = nums[i-1]*prefix[i-1];
            }
        }

        // pre compute suffix array
        
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                suffix[i]=1;
            }
            else{
                suffix[i]= suffix[i+1]*nums[i+1];
            }
        }

        int[] ans= new int[n];

        for(int i=0;i<n;i++){
            ans[i]= prefix[i]*suffix[i];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        return ans;
    }
}