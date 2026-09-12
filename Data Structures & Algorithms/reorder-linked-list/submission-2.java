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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp0 = slow.next;
        slow.next = null;

        ListNode previous = null;
        ListNode current = temp0;
        ListNode temp = null;

        while(current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        ListNode temp2 = null;
        while(previous != null){
            temp = head.next;
            temp2 = previous.next;
            head.next = previous;
            previous.next = temp;
            head = temp;
            previous = temp2;
        }
    }
}
