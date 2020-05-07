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
public static int height(Node root) {
    if(root != null)
        return 1 + max(height(root.left), height(root.right));
    else
        return -1;
}
public static void topView(Node root) {
    int MAX = 500; 
    int[] top = new int[MAX*2];
    Queue<Object[]> queue = new ArrayDeque<>();
    queue.add(new Object[]{root, MAX});
    while(!queue.isEmpty()) {
        Object[] array = queue.remove();
        Node node = (Node)array[0];
        Integer order = (Integer)array[1];
        if(node == null) continue;
        if(top[order] == 0) top[order] = node.data;
        queue.add(new Object[]{node.left, order-1});
        queue.add(new Object[]{node.right, order+1});
    }
        for(int data: top) if(data != 0) System.out.print(data + " ");
    }
static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode n = new SinglyLinkedListNode(data);
    if(position == 1) { // se asume que los testcases no tendrán listas vacías
        n.next = head;
        head = n;
        return head;
    }
    int i = 1;
    for(SinglyLinkedListNode aux = head; aux != null; aux = aux.next) {
        if((i++) == position){ // se encontró la posicion donde insertar
            if(aux.next == null) {//caso insertar al final
                aux.next = n;
                break;
            }
            SinglyLinkedListNode temp = aux.next;
            aux.next = n;
            n.next = temp;
            break;
        }
    }
    return head;
}