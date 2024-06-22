class Solution {
    class Node{
        int data;
        int r;
        int c;

        Node(int data, int r,int c){

            this.data = data;
            this.r= r;
            this.c = c;
        }
    }

    class HeapComparator implements Comparator<Node> {
        public int compare(Node x, Node y){
            return x.data-y.data;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n= matrix.length;
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Math.min(n,k), new HeapComparator());

        for(int r=0;r<Math.min(n,k); r++){
            minHeap.offer(new Node(matrix[r][0], r, 0));
        }

        Node ele = minHeap.peek();

        while(k-->0){
            ele = minHeap.poll();
            int r = ele.r;
            int c = ele.c;

            if(c< n-1){
                minHeap.offer(new Node(matrix[r][c+1],r,c+1));
            }
        }
        return ele.data;
    }
}