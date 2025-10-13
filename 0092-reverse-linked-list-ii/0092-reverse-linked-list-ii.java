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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = head;
        ListNode prev = dummy;
        for(int i=1;i<left;i++){
            prev = curr;
            curr= curr.next;
        }

        ListNode subListHead = curr;
        ListNode subListPrev = prev;

        subListPrev.next = reverse(subListHead,right-left+1);
        return dummy.next;
    }

    public ListNode reverse(ListNode head,int count){
        ListNode prev = null;
        ListNode curr= head;
        while(curr!=null && count>0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            count--;
        }
        head.next = curr;
        return prev;
    }
}