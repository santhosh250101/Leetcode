class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> bracket = new Stack<>();
        Stack<Integer> star = new Stack<>();


        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);


            if(ch == '('){
                bracket.push(i);
            }
            else if(ch == ')'){
                // check if my bracket is not empty
                if(!bracket.isEmpty()){
                    bracket.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
            else{
                star.push(i);
            }
        }
        while(!bracket.isEmpty() && !star.isEmpty()){
            if(bracket.peek()>star.peek()){
                return false;
            }
            bracket.pop();
            star.pop();
        }
        return bracket.isEmpty();
    }
}