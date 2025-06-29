class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map = new HashMap<>();


        for(char ch: s.toCharArray()){


            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        PriorityQueue<Character> pq = new PriorityQueue((a,b)-> map.get(b)-map.get(a));

        StringBuilder ans = new StringBuilder();

        pq.addAll(map.keySet());

        while(!pq.isEmpty()){
            Character top = pq.poll();
            int freq = map.get(top);
            while(freq-->0){
                ans.append(top+"");
            }
        }
        return ans.toString();
    }
}