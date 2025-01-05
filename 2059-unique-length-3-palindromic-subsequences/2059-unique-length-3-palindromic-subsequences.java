class Pair {
    int left;
    int right;
    Pair(int left,int right){
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public int countPalindromicSubsequence(String s) {

        HashMap<Character,Pair> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.get(ch).right = i;
            }
            else
            {
                map.put(ch, new Pair(i,i));
            }
        }
        int ans =0;
        for(char ch: map.keySet()){

            Pair range = map.get(ch);
            if(range.left== range.right) continue;
            ans = ans + findUnique(range.left,range.right,s);
        }
        return ans;

    }
    public static int findUnique(int left, int right,String s){
        Set<Character> set = new HashSet<>();
        for(int i= left+1;i<right;i++){
            set.add(s.charAt(i));
        }
        return set.size();

    }
}