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
    public static void main(String[] args)
    {
        List l = new List();
        l.insertFirst(24);
        //l.printList();
        l.insertFirst(4);
        l.insertFirst(81);
        l.deleteFirst();
        l.printList();

        //Node n = new Node(51);
        //System.out.print(n.value);
    }
}