class Solution {
    public int countHousePlacements(int n) {
        int MOD = 1_000_000_007;
        long[] houses= new long[n+1];
        long[] empty = new long[n+1];

        for(int i=1;i<=n;i++){
            if(i==1){
                houses[i]=1;
                empty[i]=1;
                continue;
            }
            long h = houses[i-1];
            long e = empty[i-1];
            houses[i] = empty[i-1]%MOD;
            empty[i] = (h+e)%MOD;
        }
        long ans = (houses[n]+empty[n]);
        return (int)((ans*ans)%MOD);
    }
}