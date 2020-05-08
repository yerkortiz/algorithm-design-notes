/*soluciones a los problemas de hacer una funcion*/ 
static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    SinglyLinkedListNode temp1 = head1, 
        temp2 = head2;
    while(temp1 != temp2) {
        if(temp1 == null) temp1 = head2;
        else temp1 = temp1.next;
            
        if(temp2 == null) temp2 = head1;
        else temp2 = temp2.next;
    }
    return temp1.data;
}
/*insertar en posicion x*/ 
static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    // crear un nodo con el dato a insertar
    SinglyLinkedListNode n = new SinglyLinkedListNode(data);
    if(position == 1) { // se asume que los testcases no tendrán listas vacías
        n.next = head;
        head = n;
        return head;
    }
    int i = 1;
    for(SinglyLinkedListNode aux = head; aux != null; aux = aux.next) {
        if(i == position){ // se encontró la posicion donde insertar
            if(aux.next == null) {//caso insertar al final
                aux.next = n;
                break;
            }
            SinglyLinkedListNode temp = aux.next; // insertar entre medio
            aux.next = n;
            n.next = temp;
            break;
        }
        ++i;
    }
    return head;
}