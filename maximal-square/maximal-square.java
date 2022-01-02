class Solution {
    public int maximalSquare(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] dp=new int[r][c];  //dp[i][j] indicated maximum sqaure matrix ending
        
        
        int max=0;
        for(int i=0;i<r;i++)
        {
            if(matrix[i][0]=='1'){
                dp[i][0]=1;
                max=Math.max(max,dp[i][0]);
            } 
        }
        
        for(int j=0;j<c;j++)
        {
            if(matrix[0][j]=='1'){
                dp[0][j]=1;
                max=Math.max(max,dp[0][j]);
            } 
        }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j]=='1')
                {
                    int ans=Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]));
                    dp[i][j]=1+ans;
                    max=Math.max(max,dp[i][j]*dp[i][j]);
 
                }
            }
        }
        
        return max;
    }
}