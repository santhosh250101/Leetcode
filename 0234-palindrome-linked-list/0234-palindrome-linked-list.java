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
    public boolean isPalindrome(ListNode head) {
        

        // one middle
        // two middle
        //-> two middle always give second one so, no issue
        // 


        // if(fp.next == null) then two middle
        // if fp == null then start from middle.next;
        

        ListNode sp = head;
        ListNode fp = head;

        while(fp!=null && fp.next!=null){
            fp= fp.next.next;
            sp=sp.next;
        }
        ListNode ll2 = null;
        if(fp!=null){ // single  middle so start from middle.next
            ll2 = sp.next;
        }
        else{
            ll2 = sp;
        }

        ListNode ll1 = head;
        ListNode reversed = reverse(ll2);
        while(reversed!=null){

            if(reversed.val == ll1.val){
                reversed=reversed.next;
                ll1=ll1.next;
            }
            else{
                return false;
            }
        }
        return true;
    }

    ListNode reverse(ListNode node){

        ListNode prev = null;
        ListNode curr = node;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }
}