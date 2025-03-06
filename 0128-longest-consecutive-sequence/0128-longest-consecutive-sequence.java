class Solution {
    public int longestConsecutive(int[] arr) {
     /*
      */   

      Arrays.sort(arr);
      int n = arr.length;
      int[] dp = new int[arr.length];
      int ans =0;
      for(int i=0;i<n;i++){
        if(i==0){
            dp[i]=1;
        }
        else{

            if(arr[i-1]+1 == arr[i]){
                dp[i] = dp[i-1]+1;
            }
            else if(arr[i]== arr[i-1]){
                dp[i] = dp[i-1];
            }
            else{
                dp[i]=1;
            }
        }
        ans = Math.max(ans,dp[i]);
      }
      return ans;
    }
}