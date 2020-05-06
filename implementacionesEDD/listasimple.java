package edd;
public class ListaSimple {
    Node head;
    public class Node {
        int data;
        Node next;
        Node(int d) {data = d;}
    }
    public void insertFirst(int d) {
        if(head == null)
            head = new Node(d);
        else {
            Node aux = new Node(d);
            aux.next = head;
            head = aux;
        }
    }
    public void insertLast(int d) {
        if(head == null)
            head = new Node(d);
        else {
            Node aux;
            for(aux = head; aux.next != null; aux = aux.next);
            aux.next = new Node(d);
        }   
    }
    public boolean search(int key) {
        if(head == null) return false;
        for(Node aux = head; aux != null; aux = aux.next)
            if(aux.data == key) return true;
        return false;
    }
    public int deleteFirst() {
        if(head == null) {
            System.out.println("Lista vacía");
            return -1;
        } else {
            int a = head.data;
            head = head.next;
            return a;
        }
    }
    public int deleteLast() {
        if(head == null) {
            System.out.println("Lista vacía");
            return -1;
        } else if(head.next == null) {
            int a = head.data;
            head = null;
            return a;
        } else {
            Node aux;
            for(aux = head; aux.next.next != null; aux = aux.next);
            int a = aux.next.data;
            aux.next = null;
            return a;
        }
    }
    public void printLista() {
        for(Node aux = head; aux != null; aux = aux.next)
            System.out.print(aux.data + " ");
    }
    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        for(int i = 0; i < 10; ++i)
            l.insertFirst(i);
        for(int i = 0; i < 10; ++i)
            System.out.print(l.deleteFirst() + " ");
        for(int i = 0; i < 10; ++i)
            l.insertLast(i);
        System.out.println(l.search(2));
        for(int i = 0; i < 10; ++i)
            System.out.print(l.deleteLast() + " ");
    }
}