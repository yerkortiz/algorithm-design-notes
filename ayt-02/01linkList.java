class List {
    Node head;
    static class Node {
        int value;
        Node next;
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
        if(head == null) {
            head = n;
        } else {
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
    public deleteFirst()
    {
        if (head.next != null) head = head.next;
        else head = null;
    }
    public static void main(String[] args)
    {
        List l = new List();
        l.insertFirst(22);
        l.printList();
    }
}