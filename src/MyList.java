
public class MyList {

    Node head, tail;

    MyList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    Node beforeNode(Node q) {
        Node f = head;
        while (f.next != q) {
            f = f.next;
        }
        return f;
    }

    // (1) 
    void addLast(Person x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    void visit(Node p) {
        if (p != null) {
            System.out.print(p.info);
        }
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            visit(p);
            p = p.next;
        }
        System.out.println();
    }

    void addMany(String[] a, int[] b) {
        int n, i;
        n = a.length;
        for (i = 0; i < n; i++) {
            addLast(new Person(a[i], b[i]));
        }
    }

    // (2)
    Node searchByName(String xName) {
        Node p = head;
        while (p != null) {
            if (p.info.name.equals(xName)) {
                return (p);
            }
            p = p.next;
        }
        return (null);
    }

    // (3)
    void addFirst(Person x) {
        Node a = new Node(x);
        if (isEmpty()) {
            head = tail = a;
            return;
        }
        a.next = head;
        head = a;
    }
   // (4)
void insertAfter(Node q, Person x) {
          Node  new_node = new Node(x);
          new_node.next = q.next;
          q.next = new_node;
                    
    }

    // (5)
    void insertBefore(Node q, Person x) {
         Node  new_node = new Node(x);
         new_node.next=q;
         Node i, j;
         j = null;
         i = head;
         while(i != null){
           if(i == q) break;
           j = i;
           i = i.next;
         }
         j.next = new_node;
                    
    }

    // (6)
 void remove(Node h){
        if(h == null) return;
        if(isEmpty()) return;
        Node f,p;
        f = null;
        p = head;
        while(p != null){
            if(p == h) break;
            f = p;
            p = p.next;

        }
        if(p == null)return;
        if(f == null){
            head = head.next;
            if(head == null) tail = null;
            return;
        }
         f.next = h.next;
         if(f.next == null) tail = f;
    }

    // (7)
    void remove(String xName) {
        
    }

    // (8)
    void remove(int xAge) {
        
    }

    // (9)
    void removeAll(int xAge) {
        
    }

    // (10)
    Node pos(int k) {
        return (null);
    }

    // (11)
    void removePos(int k) {
    }

    // (12)
    void sortByName() {
    }

    // (13)
    void sortByAge() {
    }

    // (14)
    int size() {
        return (0);
    }

    // (15)
    Person[] toArray() {
        return (null);
    }

    // (16)
    void reverse() {
    }

    // (17) 
    Node findMaxAge() {
        return (null);
    }

    // (18) 
    Node findMinAge() {
        return (null);
    }

    // (19) 
    void setData(Node p, Person x) {
    }

    // (20) 
    void sortByAge(int k, int h) {
    }

    // (21) 
    void reverse(int k, int h) // reverse from k to h 
    {
    }
}
