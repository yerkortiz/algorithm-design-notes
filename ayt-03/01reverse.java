import java.util.Scanner;
class List {
    Node head;//nodo centinela
    static class Node {
        int value;
        Node next;//siguiente nodo
        Node(int v) {
            value = v;
            next = null;
        }
    }
    /* Intenten implementar este metodo, pero de forma recursiva */
    public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.value + " "); 
            n = n.next; 
        } 
    } 
    public void insertFirst(int v)
    {
        Node n = new Node(v);
        if(head == null) { //lista esta vacia
            head = n;
        } else { // lista no esta vacia
            Node aux = head;
            n.next = aux;
            head = n;
        }
    }
    public void insertLast(int v)
    {
        Node n = new Node(v);
        if(head == null) // lista vacía
            head = n;
        else 
            for(Node aux = head; aux != null; aux = aux.next)
                if(aux.next == null) {
                    aux.next = n;
                    break;
                }
    }
    public boolean search(int key)
    {
        Node aux = head;
        while(aux != null) {
            if(aux.value == key) return true;
            aux = aux.next;
        }
        return false;
    }
    public void deleteFirst()
    {
        if (head.next != null) head = head.next;//hay 2 o mas elementos
        else head = null;//hay 0 o 1 elemento
    }
    public void printReverse(Node node)
    {
        if(node == null) return;
        printReverse(node.next);
        System.out.print(node.value + " ");
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List l = new List();
        int n = input.nextInt();
        for(int i = 0; i < n; ++i) {
            int k = input.nextInt();
            l.insertLast(k);
        }
        List l_inverse = new List();
        for(Node aux = l.head; aux != null; aux = aux.next)
            l_inverse.insertFirst(aux.value);
        l_inverse.printList();
    }
}