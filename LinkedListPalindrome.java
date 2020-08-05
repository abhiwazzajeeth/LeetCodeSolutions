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
        Stack<Integer> palindrome = new Stack<>();
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        if(head == null){
            return true;
        }
        if(head.next == null){
            return true;
        }
        while(fastPointer != null && fastPointer.next != null){
            palindrome.push(slowPointer.val);
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        while(slowPointer != null){
            if(slowPointer.val == (Integer) palindrome.peek()){
                palindrome.pop();
            }
            slowPointer = slowPointer.next;
        }
        if(palindrome.empty()){
            return true;
        }
        
        return false;
    }
}
