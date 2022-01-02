class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int[] rem =new int[60];
        
        int count=0;
        for(int i=0;i<time.length;i++)
        {
            int re=time[i]%60;
            
            if(re==0)
            {
                count=count+rem[re];
            }
            else
            {
                count=count+rem[60-re];
            }
            rem[re]++;
        }
        return count;
    }
}