class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums2.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){

            int num = nums2[i];

            while(!st.isEmpty() && num> st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                map.put(num,-1);
            }
            else{
                map.put(num,st.peek());
            }
            st.push(num);
        }
        int[] temp = new int[nums1.length];
        for(int i=0;i<temp.length;i++){
            temp[i] = map.get(nums1[i]);
        }
        return temp;
    }
}