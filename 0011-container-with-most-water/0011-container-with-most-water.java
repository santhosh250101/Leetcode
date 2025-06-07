class Solution {
    public int maxArea(int[] height) {
        
        int area=0;
        int n= height.length;
        int left =0;
        int right =n-1;

        while(left<right){

            int leftWall = height[left];
            int rightWall = height[right];
            int currentArea =  Math.min(leftWall,rightWall) * (right-left);
            area = Math.max(area,currentArea);

            // decide direction
            if(leftWall<rightWall){
                left++;
            }
            else{
                right--;
            }


        } 

        return area;

    }
}