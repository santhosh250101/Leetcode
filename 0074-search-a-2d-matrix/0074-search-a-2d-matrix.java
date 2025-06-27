class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int low =0;
        int high = matrix[0].length-1;


        while(low<matrix.length && high>=0 ){

            int value = matrix[low][high];

            if(target == value) return true;

            if(target<value){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}