class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m==0 || n==0){
            return Math.max(m,n);
        }

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0){
                    dp[i][j]=0;
                }
                else if(i==0){
                    dp[i][j]= 1+ dp[i][j-1];
                }
                else if(j==0){
                    dp[i][j]= 1+dp[i-1][j];
                }
                else{

                    char c1= word1.charAt(i-1);
                    char c2= word2.charAt(j-1);
                    if(c1==c2){
                        dp[i][j]= dp[i-1][j-1];
                    }
                    else{
                        // delete
                        int op1 = dp[i-1][j];
                        // insert
                        int op2 = dp[i][j-1];
                        // replace
                        int op3= dp[i-1][j-1];
                        int ans = 1+Math.min(op1,Math.min(op2,op3));
                        dp[i][j]= ans;
                    }
                    

                }
            }
        }
        return dp[m][n];
    }
}