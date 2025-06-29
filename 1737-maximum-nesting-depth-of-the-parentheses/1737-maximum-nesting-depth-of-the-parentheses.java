class Solution {
    public int maxDepth(String s) {
        
        // use stack or if open brace count ++ retrun maxc count
        int ans =0;
        int count =0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                count++;
                ans = Math.max(ans,count);
            }
            else if(ch == ')'){
                count--;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}