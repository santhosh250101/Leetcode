class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length()) return false;
        
        return isSubsequence(s,t,0,0);
    }
    
    
    public boolean isSubsequence(String s,String t,int i,int j)
    {
        
        if(i==s.length()) return true;
        if(j==t.length()) return false;
        if(s.charAt(i)== t.charAt(j))
        {
            return isSubsequence(s,t,i+1,j+1);
        }
        else
        {
            return isSubsequence(s,t,i,j+1);
        }
    }
}