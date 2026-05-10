class LRUCache {

    class Node {
        int key;
        int val;
        Node next;
        Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    HashMap<Integer, Node> cache = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;

        head.prev = null;
        tail.next = null;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)) {
            removeNode(cache.get(key));
            addToFront(cache.get(key));
            return cache.get(key).val;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        
       if(cache.containsKey(key)) {
            cache.get(key).val = value;
            removeNode(cache.get(key));
            addToFront(cache.get(key));
       } else if(!cache.containsKey(key) && cache.size() < capacity) {
            Node node = new Node(key,value);
            cache.put(key, node);
            addToFront(node);
       } else {
            cache.remove(tail.prev.key);
            removeNode(tail.prev);
            Node node = new Node(key, value);
            cache.put(key,node);
            addToFront(node);
       }
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToFront(Node node) {
       Node oldFirst = head.next;

       node.next = oldFirst;
       node.prev = head;

       head.next = node;
       oldFirst.prev = node;
    }


}
