class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String,Boolean> hm=new HashMap<>();
        for(String w:wordList) hm.put(w,false);
        Queue<String> q=new LinkedList<>();
        Queue<Integer> l=new LinkedList<>();
        int level=0;
        q.add(beginWord);
        l.add(level);
        hm.put(beginWord,true);
        while(!q.isEmpty())
        {
            String src=q.poll();
            int le=l.poll();
            if(src.equals(endWord)) return le+1;
            for(int i=0;i<src.length();i++)
            {
                char[] word=src.toCharArray();
                for(int j=0;j<26;j++)
                {
                    char ch=(char)('a'+j);
                    word[i]=ch;
                    String ns=new String(word);
                    if(hm.containsKey(ns) && hm.get(ns)==false)
                    {
                        hm.put(ns,true);
                        q.add(ns);
                        l.add(le+1);
                    }
                }
            }
        }
        return 0;
    }
}