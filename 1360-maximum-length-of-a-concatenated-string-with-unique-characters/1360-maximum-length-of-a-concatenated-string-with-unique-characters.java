class Solution {
    public int maxLength(List<String> arr) {
        
        int ans = findAns(0,"",arr);
        return ans;
    }


    public static int findAns(int ci,String str,List<String> arr){

        // base case

        if(ci == arr.size()){
            // check validity of the string

            int[] freq = new int[26];
            for(char ch: str.toCharArray()){
                freq[ch-'a']++;
                if(freq[ch-'a']>1){
                    return 0;
                }
            }
            return str.length();

        }

        int op1=0,op2=0;
        // include
        if(str.length() + arr.get(ci).length() <=26){
            op1 = findAns(ci+1,str+arr.get(ci),arr);
        }
        // exclude;
        op2 = findAns(ci+1,str,arr);

        return Math.max(op1,op2);

    }
}