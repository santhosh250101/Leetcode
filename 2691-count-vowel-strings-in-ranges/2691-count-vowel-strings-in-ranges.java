class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int n = words.length;
        int[] prefix = new int[n+1];

        for(int i=0;i<n;i++){
            String word = words[i];

            if(!word.isEmpty() && vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length()-1))){
                prefix[i + 1] = prefix[i] + 1;
            }
            else
            {
                prefix[i + 1] = prefix[i];
            }
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            ans[i] = prefix[ri + 1] - prefix[li];
        }
        return ans;
    }
}