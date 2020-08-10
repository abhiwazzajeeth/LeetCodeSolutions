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
        ListNode leastHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);
        
        ListNode least = leastHead;
        ListNode greater = greaterHead;
        
        while(head != null) {
            if(head.val >= x) {
                ListNode newVal = new ListNode(head.val);
                newVal.next = null;
                greater.next = newVal;
                greater = greater.next;
            } else {
                ListNode newVal = new ListNode(head.val);
                newVal.next = null;
                least.next = newVal;
                least = least.next;
            }
            head = head.next;
        }
        greater.next = null;
        least.next = greaterHead.next;
        
        return leastHead.next;
    }
}
