class Solution {
    public static class Triple{
        int x,y,time;
        Triple(int x,int y,int time){
            this.x=x;
            this.y=y;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        
        Queue<Triple> queue= new LinkedList<>();
        int total =0;
        // traverse complete grid and push all rooten positions into queue

        int m = grid.length;
        int n= grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    Triple triple = new Triple(i,j,0);
                    queue.add(triple);
                }
                if(grid[i][j]!=0) total++;
            }
        }

        int[] dx= {1,0,-1,0};
        int[] dy= {0,-1,0,1};
        int totalTime =0;
        int rottenedAsOfNow=0;
        while(!queue.isEmpty()){
            Triple top = queue.poll();

            for(int i=0;i<4;i++){

                int nx= top.x+ dx[i];
                int ny= top.y+ dy[i];

                if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==1){
                    grid[nx][ny]=2;
                    int time = top.time +1;
                    queue.add(new Triple(nx,ny,time));
                    totalTime= Math.max(totalTime,time);

                }
            }
            rottenedAsOfNow++;
        }

        return rottenedAsOfNow == total ? totalTime: -1;
    }
}