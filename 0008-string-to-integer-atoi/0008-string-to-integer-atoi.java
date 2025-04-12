class Solution {
    public int myAtoi(String s) {
        
        s= s.trim();

        long ans=0;
        int sign = 1;
        for(int i=0;i<s.length();i++){
            if(i==0){
                if(s.charAt(i)== '-'){
                    sign= -1;
                    continue;
                }
                else if(s.charAt(i)== '+'){
                    sign = 1;
                    continue;
                }
            }
            int digit = s.charAt(i) -'0';
            if(digit>=0 && digit<=9){
                ans = (ans*10)+ digit;
                if(sign == -1){
                    if(-ans <Integer.MIN_VALUE){
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
                break;
            }
        }
        ans = ans*sign;
        return (int) ans;
    }
}