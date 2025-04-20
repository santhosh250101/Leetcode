class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        long sum=0;
        int[] pse = previousSmaller(arr);
        int[] nse = nextSmaller(arr);
        for(int i=0;i<arr.length;i++){
            long left = i-pse[i];
            long right = nse[i]-i;
            sum= (sum+ ((left*right*arr[i])%MOD))%MOD;
        }
        return (int)sum;
    }

    public static int[] previousSmaller(int[] heights){
        int n= heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int curr = heights[i];
            while(!st.isEmpty() && curr< heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }   
        return ans;
    }
    public static int[] nextSmaller(int[] heights){
        int n= heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr = heights[i];
            while(!st.isEmpty() && curr<= heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}