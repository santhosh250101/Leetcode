class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> merged = new LinkedList<>();

        // sort intervals as well;

        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        for(int[] interval: intervals){
            if(merged.size()==0){
                merged.add(interval);
            }
            else{
                int[] prev = merged.getLast();
                int[] curr = interval;

                if(curr[0]>= prev[0] && curr[0]<=prev[1]){
                    merged.getLast()[1] = Math.max(merged.getLast()[1],curr[1]);
                }
                else{
                    merged.add(interval);
                }
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}