class Solution {
    public int largestRectangleArea(int[] heights) {

        int[] nse = Nse(heights);
        int[] pse = Pse(heights);
        int ans =0;
        for(int i=0;i<heights.length;i++){
            int area = heights[i] * (nse[i]-pse[i]-1);
            ans = Math.max(ans,area);
        }
        return ans;
    }

    public int[] Nse(int[] heights){
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && (heights[i]<=heights[st.peek()])){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = heights.length;
            }
            else{
                ans[i]= st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] Pse(int[] heights){
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && (heights[i]<=heights[st.peek()])){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i]= st.peek();
            }
            st.push(i);
        }
        return ans;
    }




}