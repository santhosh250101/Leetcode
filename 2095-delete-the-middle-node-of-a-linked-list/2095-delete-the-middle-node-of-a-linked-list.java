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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode sp=head;
        ListNode fp= head;
        ListNode prevToMid=null;
        while(fp!=null && fp.next!=null)
        {
            fp=fp.next.next;
            prevToMid=sp;
            sp=sp.next;
        }
        
        if(fp!=null && fp.next!=null) //even length
        {
            prevToMid=sp;
            sp=sp.next;
        }
        if(prevToMid.next!=null)
        prevToMid.next=sp.next;
        return head;
    }
}



// 1 2 3 4
//     s
//     f

// 1 2 3 4
//   s
//     f
// 1   2   3   4  5  6
//         s   
//                 f

// 1 2 3 4 5
//     s
//         f