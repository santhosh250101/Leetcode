class Solution {
    public String longestPalindrome(String s) {
        
        // idea is assuming that character is center of the string


        int n= s.length();
        String ans = "";
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            
            // odd length
            int l =i;
            int r =i;

            while(l>=0 && r<s.length() && s.charAt(l)== s.charAt(r)){
                if(r-l+1 > maxLen){

                    maxLen = r-l+1;
                    ans = s.substring(l,r+1);
                }
                l--;
                r++;
            }

            //even length
            l =i;
            r = i+1;

            while(l>=0 && r<s.length() && s.charAt(l)== s.charAt(r)){
                if(r-l+1 > maxLen){

                    maxLen = r-l+1;
                    ans = s.substring(l,r+1);
                }
                l--;
                r++;
            }
            // even length
        }
        return ans;
    }
}