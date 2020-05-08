import java.lang.*;
import java.util.*;
public class Bst {
    public class Node {
        int dato;
        Node left, right;
        Node (int d) {dato = d;}
    }
    Node root; //raíz
    public void insert(int d) {
        root = insertAux(d, root);
    }
    public Node insertAux(int d, Node root) {
        if(root == null) { // caso vacío
            Node n = new Node(d);
            root = n;
            return root;
        } else if(root.dato > d) { // me muevo a la izquierda
            root.left = insertAux(d, root.left);
        }else if(root.dato <= d) {// me voy a la derecha
            root.right = insertAux(d, root.right);
        }
        return root; // raíz original del árbol
    }
    public void inorder() { 
       inorderAux(root); 
    } 
    // preorder, postorder, inorder
    void inorderAux(Node root) { 
        if (root != null) { 
            //preorder
            inorderAux(root.left); 
            System.out.println(root.dato); 
            //inorder
            inorderAux(root.right); 
            //postorder
        } 
    }
    public static int height(Node current) {
        if(current != null)
            return 1 + Math.max(height(current.left), height(current.right));
        else
            return -1;
    }
    public static void topView(Node root) {
        int MAX = 500; // puntos de vision desde arriba
        int[] top = new int[MAX*2];
        Queue<Object[]> queue = new ArrayDeque<>(); //fifo
        queue.add(new Object[]{root, MAX});//inserto en la cola
        while(!queue.isEmpty()) { // mientras la cola no esté vacía
            Object[] array = queue.remove();//sacar al primero de la cola
            Node node = (Node)array[0];
            Integer order = (Integer)array[1];
            if(node == null) continue;
            if(top[order] == 0) top[order] = node.dato;
            queue.add(new Object[]{node.left, order-1});
            queue.add(new Object[]{node.right, order+1});
        }
        for(int data: top) if(data != 0) System.out.print(data + " ");
    }
    public static void BFS(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node n = q.remove();
            System.out.print(n.dato + " ");
            Node l = n.left;
            Node r = n.right;
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
    }
    public static void main(String[] args) {
        Bst tree = new Bst();
        tree.insert(4);
        tree.insert(1);
        tree.insert(10);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        //tree.inorder();
        BFS(tree.root);
    }
}