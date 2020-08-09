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
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        
        ListNode current = dummy_head;
        
        while(current.next != null && current.next.next != null) {
            ListNode swap1 = current.next;
            ListNode swap2 = current.next.next;
            
            current.next = swap2;
            swap1.next = swap2.next;
            swap2.next = swap1;
            
            current = swap1;
        }
        return dummy_head.next;
    }
}
