class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> fMap = new HashMap<>();

        for(int num: nums){
            fMap.put(num,fMap.getOrDefault(num,0)+1);
        }
        int n = nums.length;
        int[] res = new int[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if(fMap.get(a) == fMap.get(b)){
                return b-a;
            }
            return fMap.get(a)-fMap.get(b);
        });


        pq.addAll(fMap.keySet());
        int i=0;
        while(!pq.isEmpty()){

            int top = pq.poll();
            int freq = fMap.get(top);
            while(freq>0){
                res[i++]= top;
                freq--;
            }
        }
        return res;
    }
}