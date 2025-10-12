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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fp = head;
        ListNode sp = head;

        while(n>0){
            fp=fp.next;
            n--;
        }
        ListNode prev = null;
        while(fp!=null){
            prev = sp;
            sp=sp.next;
            fp=fp.next;
        }
        if(prev == null) return head.next;
        prev.next = sp.next;
        return head;

        // 1   2   3   4   5
        //             sp
        //                     fp
    }
}