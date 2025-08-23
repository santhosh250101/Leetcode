class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];

        Map<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<n;i++){
            map.put(arr[i], i);
        }
        int maxLen =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                // dp[j][i] indicates, ending with arr
                int prevVal = arr[i]-arr[j];
                int k = map.getOrDefault(prevVal,-1);
                if(k!=-1 && k<j){
                    dp[j][i] = dp[k][j]+1;
                }
                else{
                    dp[j][i]=2;
                }
                maxLen = Math.max(maxLen,dp[j][i]);
            }
        }

        return (maxLen ==2)?0: maxLen;
    }
}