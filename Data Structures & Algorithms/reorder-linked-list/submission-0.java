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
        ListNode previous = null;
        ListNode current = slow.next;
        slow.next = null;
        ListNode temp2 = null;

        while(current != null){
            temp2 = current.next;
            current.next = previous;
            previous = current;
            current = temp2;
        }
        ListNode first = head;
        ListNode second = previous;
        while(second != null){
            ListNode fn = first.next;
            ListNode sn = second.next;

            first.next = second;
            second.next = fn;

            first = fn;
            second = sn;
        }

    }
}
