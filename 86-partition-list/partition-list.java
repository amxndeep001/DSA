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
    public ListNode partition(ListNode head, int x) {
         if(head == null) return head;
        ListNode l = new ListNode(0);
        ListNode r = new ListNode(0);
        ListNode a = l;
        ListNode b = r;
        while(head != null) {
            if(head.val < x) {
                l.next = new ListNode(head.val);
                l = l.next;
            } else {
                r.next = new ListNode(head.val);
                r = r.next;
            }
            head = head.next;
        }
        l.next = b.next;
        r.next = null;
        return a.next;
    }
}