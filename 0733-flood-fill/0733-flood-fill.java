class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc]==color) return image;
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image,int ci,int cc,int colorToApply,int color){

        if(ci<0 || cc<0 || ci>=image.length || cc>=image[0].length || image[ci][cc]!=color){
            return;
        }
        image[ci][cc]= colorToApply;
        dfs(image,ci+1,cc,colorToApply,color);
        dfs(image,ci,cc-1,colorToApply,color);
        dfs(image,ci-1,cc,colorToApply,color);
        dfs(image,ci,cc+1,colorToApply,color);
        return;
    }
}