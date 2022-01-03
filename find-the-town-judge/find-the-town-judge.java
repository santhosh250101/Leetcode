class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] indegree=new int[n+1];
        int[] outdegree=new int[n+1];
        for(int[] a:trust)
        {
            int p1=a[0];
            int p2=a[1];          //p1 trust p2 so,indegree of p2++
            
            indegree[p2]++;
            outdegree[p1]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==n-1 && outdegree[i]==0) return i;
        }
        return -1;
        
        
    }
}