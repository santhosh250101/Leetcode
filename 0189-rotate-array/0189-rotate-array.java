class Solution {
    public void rotate(int[] arr, int k) {

        // right rotate
        // reverse
        // reverse 0,k-1
        // revrse k, n-1
        int n= arr.length;
        k= k%n;
        
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        // right rotate (k) = left rotate(n-k);
    }

    public void reverse(int[] arr, int start,int end){

        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}