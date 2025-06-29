class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();
        int count =0;
        for(char ch:s.toCharArray()){

            if(ch == '('){
                count++;
                if(count!=1){
                    sb.append("(");
                }
            }
            else{
                count--;
                if(count!=0){
                    sb.append(")");
                }
            }

        }
        return sb.toString();
    }
}