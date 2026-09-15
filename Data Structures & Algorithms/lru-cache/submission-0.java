class Node{
    int key;
    int val;
    
    Node prev;
    Node next;

    public Node(int key, int value){
        this.key = key;
        this.val = value;
    }
}

class LRUCache {

    Map<Integer, Node> map;
    int capacity;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        left = new Node(0,0);
        right = new Node(0,0);
        left.next = right;
        right.prev = left;
    }
    
    public int get(int key) {
        Node a = map.get(key);
        if(a==null){
            return -1;
        }
        int ans = a.val;
        Node temp = a.next;
        a = a.prev;
        a.next = a.next.next;
        temp.prev = a;
        Node b = map.get(key);
        Node temp2 = right;
        temp2 = temp2.prev;
        temp2.next = b;
        right.prev = b;
        b.next = right;
        b.prev = temp2;
        return ans;
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            Node a = new Node(key,value);
            map.put(key,a);
            Node temp = right.prev;
            temp.next = a;
            right.prev = a;
            a.next = right;
            a.prev = temp;
        }
        else if(map.containsKey(key)){
            Node a = map.get(key);
            Node temp = a.next;
            a = a.prev;
            a.next = temp;
            temp.prev = a;
            Node b = new Node(key,value);
            map.put(key,b);
            Node temp2 = right.prev;
            temp2.next = b;
            right.prev = b;
            b.next = right;
            b.prev = temp2;

        }
        if(map.size() > capacity){
            Node temp1 = left.next;
            int a = temp1.key;
            left.next = temp1.next;
            temp1.next.prev = left;
            map.remove(a,temp1);
        }
    }
}
