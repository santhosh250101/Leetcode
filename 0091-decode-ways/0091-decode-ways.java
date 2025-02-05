class Solution {
    public int numDecodings(String s) {
        
        int[] dp = new int[s.length()];

        for(int i=0;i<s.length();i++){

            if(i==0){
                if(s.charAt(i)== '0'){
                    return 0;
                }
                else
                {
                    dp[i] =1;
                }
            }
            else{
                char prev = s.charAt(i-1);
                char curr = s.charAt(i);
                int singleOpt =0;
                int doubleOpt =0;
                if(curr == '0'){
                    singleOpt =0;
                }
                else
                {
                    singleOpt = dp[i-1];
                }

                // 2 digits
                if((prev == '1' || (prev == '2' && curr <='6'))){
                    if(i==1){
                        doubleOpt = 1;
                    }
                    else{
                        doubleOpt = dp[i-2];
                    }
                    
                }
                dp[i] = singleOpt + doubleOpt;


            }

        }

        return dp[s.length()-1];
    }
}