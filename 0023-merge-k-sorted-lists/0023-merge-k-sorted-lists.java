/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    class HeapComparator implements Comparator<ListNode>{

        public int compare(ListNode x,ListNode y){
            return x.val - y.val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode ansHead = new ListNode();
        ListNode tail = ansHead;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new HeapComparator());
        
        for (ListNode list : lists) {
            if (list != null)
                minHeap.add(list);
        }

        while(!minHeap.isEmpty()){

            ListNode peek = minHeap.poll();
            if(peek.next !=null)
                minHeap.offer(peek.next);
            tail.next = peek;
            tail = peek;
        }
        return ansHead.next;


    }
}