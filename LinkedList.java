class Node{
    int val;
    Node next;
}

public class LinkedList {
    public static void main(String[] args){
    Node a = new Node();
     Node b = new Node();
      Node c = new Node();
       Node d = new Node();
        Node e = new Node();

        a.val = 1;
        a.next = b;
        b.val = 2;
        b.next = c;
        c.val = 3;
        c.next = d;
        d.val = 4;
        d.next = e;
        e.val = 5;
        e.next = null;
    }
}
