class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int m = mat.length;
        int n= mat[0].length;

        int[] ans = new int[2];
        int low=0;
        int high = n-1;
        // going via columns via
        while(low<=high){
            int mid = (low+high)/2;

            int maxIndex = findMaxInColumn(mat,mid);

            int leftVal = (mid==0)?Integer.MIN_VALUE: mat[maxIndex][mid-1];
            int rightVal = (mid==n-1)?Integer.MIN_VALUE: mat[maxIndex][mid+1];
            int val = mat[maxIndex][mid];

            if(val> leftVal && val>rightVal){
                ans[0]=maxIndex;
                ans[1]= mid;
                break;
            }
            else if(val<leftVal){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }

    public static int findMaxInColumn(int[][] mat,int col){
        int ans =0;
        for(int i=1;i<mat.length;i++){
            if(mat[i][col]>mat[ans][col]){
                ans = i;
            }
        }
        return ans;
    }
}