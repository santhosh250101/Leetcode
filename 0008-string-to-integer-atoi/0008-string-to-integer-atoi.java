class Solution {
    public int myAtoi(String s) {
        s= s.trim();
        if(s.length()==0) return 0;
        boolean isNegative = false;
        long ans = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i==0){
                if(s.charAt(i) == '-'){
                    isNegative = true;
                }
                else if(s.charAt(i) == '+'){
                    continue;
                }
                else{
                    if(ch>='0' && ch<='9'){
                        int digit = s.charAt(i) -'0';
                        ans = (ans *10)+ digit;
                    }
                    else{
                        if(isNegative) return -(int)ans;
                        return (int)ans;
                    }
                }
            }
            else{
                if(ch>='0' && ch<='9'){
                    int digit = s.charAt(i) -'0';
                    ans = (ans *10)+ digit;

                    if(isNegative){
                        if(-ans< Integer.MIN_VALUE){
                            return Integer.MIN_VALUE;
                        }
                    }
                    else{
                        if(ans>Integer.MAX_VALUE){
                            return Integer.MAX_VALUE;
                        }
                    }
                }
                else{
                    if(isNegative) return -(int)ans;
                    return (int)ans;
                }
            }
        }
        if(isNegative) return -(int)ans;
        return (int)ans;

    }
}