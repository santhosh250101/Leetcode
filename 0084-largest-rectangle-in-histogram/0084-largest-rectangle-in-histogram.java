class Solution {
    public int largestRectangleArea(int[] heights) {

        int[] nse = nextSmaller(heights);
        int[] pse = previousSmaller(heights);

        int area=0;
        int n = heights.length;
        for(int i=0;i<n;i++){
            area= Math.max(area, (nse[i]-pse[i]-1)* heights[i]);
        }
        return area;
    }

    public static int[] previousSmaller(int[] heights){
        int n= heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int curr = heights[i];
            while(!st.isEmpty() && curr<= heights[st.peek()]){
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