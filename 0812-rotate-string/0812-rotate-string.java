class Solution {
    public boolean rotateString(String s, String goal) {
        
        String concat = s+s;
        return (goal.length() == s.length()) && concat.indexOf(goal)!=-1;
    }
}