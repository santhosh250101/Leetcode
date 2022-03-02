class Solution {
    public int[] countBits(int n) {
        
        int[] bits = new int[n+1];
        
        
        Arrays.fill(bits,-1);
        
        
        for(int i=0;i<bits.length;i++)
        {
            
            if(bits[i]==-1)
            {
                bits[i]= findBits(i,bits);
            }
        }
        
        return bits;
    }
    
    public int findBits(int num,int[] bits)
    {
        if(num==0 || num==1)
        {
            return (num==0)?0:1;
        }
        else if(num%2==0)
        {
            bits[num]=findBits(num/2,bits);
        }
        else
        {
            bits[num]=1 + findBits(num/2,bits);
        }
        return bits[num];
    }
}