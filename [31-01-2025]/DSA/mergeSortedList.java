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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode head = new ListNode(100);
        ListNode temp = head;

        while(t1!=null && t2!=null){
            if(t1.val < t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

            if(t1 == null) temp.next = t2;
            else temp.next = t1;

            return head.next;
    }
}
