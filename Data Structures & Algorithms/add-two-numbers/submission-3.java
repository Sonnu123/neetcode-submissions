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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode n = dummy;
        int carry = 0;
        int v = 0;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                v = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 != null){
                v = l1.val + carry;
                l1 = l1.next;
            }
            else if(l2 != null){
                v = l2.val + carry;
                l2 = l2.next;
            }
            int num = v % 10;
            carry = v/10;
            n.next = new ListNode(num);
            n = n.next;
            
        }
        if(carry != 0){
            n.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
