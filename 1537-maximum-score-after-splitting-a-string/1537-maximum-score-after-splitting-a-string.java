class Solution {
    public int maxScore(String s) {
        int len = s.length();
        int[] zeros= new int[len-1];
        int[] ones = new int[len-1];

        for(int i=0;i<len-1;i++){
            if(i==0){
                zeros[i] = s.charAt(i) =='0' ?1: 0;
            }
            else
            {
                zeros[i] = zeros[i-1]+ (s.charAt(i) =='0' ?1: 0);
            }
        }

        //for ones iterate from last

        for(int i=len-2;i>=0;i--){
            char curr= s.charAt(i+1);
            if(i == len-2){
                ones[i] = curr == '1'?1: 0;
            }
            else{
                ones[i] = ones[i+1]+ (curr=='1'?1: 0);
            }
        }

        int ans =0;
        for(int i=0;i<len-1;i++){
            ans = Math.max(ans, zeros[i]+ones[i]);
        }

        System.out.println(Arrays.toString(zeros));
        System.out.println(Arrays.toString(ones));
        return ans;
    }
}