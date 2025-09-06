class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low =0;
        int high = matrix[0].length-1;


        while(low<matrix.length && high>=0){
            int val = matrix[low][high];

            if(val== target) return true;

            if(target>val){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
    }
}