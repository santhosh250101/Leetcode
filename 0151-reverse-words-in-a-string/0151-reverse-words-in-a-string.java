class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for(int i=words.length-1;i>=0;i--){
            String word= words[i].trim();
            if(word.length()>0){
                if(sb.length() ==0){
                    sb.append(word);
                }
                else{
                    sb.append(" ");
                    sb.append(word);
                }
            }
        }
        return sb.toString();
    }
}