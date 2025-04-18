class Solution {
    public String removeDuplicateLetters(String s) {
        
        Stack<Character> st= new Stack<>();
        Set<Character> seen = new HashSet<>();

        int[] chars= new int[26];

        for(char ch: s.toCharArray()){
            chars[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            chars[ch-'a']--;
            if(!seen.contains(ch)){
                while(!st.isEmpty() && (st.peek()>ch && (chars[st.peek()-'a']>0))){
                    seen.remove(st.pop());
                }
                st.push(ch);
                seen.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}