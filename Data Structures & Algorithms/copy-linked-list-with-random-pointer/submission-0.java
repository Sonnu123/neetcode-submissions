/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> bum = new HashMap<>();
        Node c = head;
        while(c != null){
            bum.put(c, new Node(c.val));
            c = c.next;
        }
        Node c1 = head;
        while(c1 != null){
            bum.get(c1).random = bum.get(c1.random);
            bum.get(c1).next = bum.get(c1.next);
            c1 = c1.next;
        }
        return bum.get(head);
    }
}
