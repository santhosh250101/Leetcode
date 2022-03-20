class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {        
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:tops)
        {
            set.add(i);
        }
        
        for(int i:bottoms)
        {
            set.add(i);
        }
        
        int ans=Integer.MAX_VALUE;
        for(Integer target: set)
        {
            int count=0;
            
            for(int i=0;i<tops.length;i++)
            {
                if(tops[i]==target)
                {
                    continue;
                }
                else if(bottoms[i]==target)
                {
                    count++;
                }
                else
                {
                    count=Integer.MAX_VALUE;
                    break;
                }
            }
            ans=Math.min(ans,count);
        }
        for(Integer target: set)
        {
            int count=0;

            for(int i=0;i<tops.length;i++)
            {
                if(bottoms[i]==target)
                {
                    continue;
                }
                else if(bottoms[i]==target)
                {
                    count++;
                }
                else
                {
                    count=Integer.MAX_VALUE;
                    break;
                }
            }
            ans=Math.min(ans,count);
        }
        for(Integer target : set)
        {
            int count=0;
            for(int i=0;i<bottoms.length;i++)
            {
                if(bottoms[i]==target)
                {
                    continue;
                }
                else if(tops[i]==target)
                {
                    count++;
                }
                else
                {
                    count=Integer.MAX_VALUE;
                    break;
                }
            }
            ans=Math.min(ans,count);
        }
        
        return (ans==Integer.MAX_VALUE?-1:ans);
        
    }
}