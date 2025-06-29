class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        int ans =0;
        for(String str: strs){
            minLength = Math.min(minLength,str.length());
        }
        for(int i=1;i<=minLength;i++){
            if(isPossible(strs,i-1)){
                ans = i;
            }
            else{
                return strs[0].substring(0,ans);
            }
        }
        return strs[0].substring(0,ans);
    }

    public static boolean isPossible(String[] strs,int ci){

        char ch = strs[0].charAt(ci);

        boolean isValid = true;
        for(int i=1;i<strs.length;i++){
            if(strs[i].charAt(ci)!=ch) return false;
        }
        return isValid;
    }
}