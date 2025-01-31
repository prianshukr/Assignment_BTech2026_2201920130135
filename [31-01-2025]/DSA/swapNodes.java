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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = head.next;
        ListNode prev = null;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != null && fast!=null){
            slow.next = fast.next;
            fast.next = slow;

            if(prev != null) prev.next = fast;
            prev = slow;

            slow = slow.next;
            if(slow!= null) fast = slow.next;
        }
        return newHead;


    }
}
