class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> fmap = new HashMap<>();

        Arrays.stream(arr)
        .forEach(i->{
            int rem =0;
            if(i<0){
                rem = ((i%k)+k)%k;
            }
            else
            {
                rem = i%k;
            }
            fmap.put(rem,fmap.getOrDefault(rem,0)+1);
        });


        Set<Integer> freqs  = fmap.keySet();

        for(int i: freqs){

            if(i ==0){

                if(fmap.getOrDefault(i,0)%2==1){
                    return false;
                }
            }
            else
            {
                int f1 = fmap.getOrDefault(i,0);
                int f2 = fmap.getOrDefault(k-i,0);
                if(f1!=f2) return false;
            }
        }
        return true;
    }
}