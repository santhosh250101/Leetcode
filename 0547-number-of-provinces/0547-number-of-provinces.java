class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        // applying the dfs on the matix
        int provinces=0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                dfs(isConnected,i,visited);
            }
        }
        return provinces;

    }

    public void dfs(int[][] isConnected, int ci,boolean[] visited){
        visited[ci]=true;

        for(int i=0;i<isConnected[ci].length;i++){
            if(isConnected[ci][i]==1 && !visited[i]){
                dfs(isConnected,i,visited);
            }
        }
    }
}