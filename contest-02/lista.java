public class LinkedList {
    public class Node {
        int data;
        Node next;
        Node (int d){data = d;}
    }
    Node head;
    public boolean isEmpty() {
        return head == null;
    }
    public void insertFirst(int d) {
        Node n = new Node(d);
        if(isEmpty()) // si la lista está vacía
            head = n;
        else {
            n.next = head;
            head = n;
        } 
    }
    public static void main(String[] args) {

    }
}