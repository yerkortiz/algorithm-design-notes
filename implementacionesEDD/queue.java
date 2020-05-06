package edd;
/* Implementacion de una cola */
public class Queue {
    QNode front, tail;
    class QNode { 
        int data; 
        QNode next;
        QNode(int d) { data = d; } 
    } 
    /* método encolar (insertar al principio) */
    public boolean isEmpty() { //O(1)
        return front == null; 
    } 
    public void enqueue(int d) { //O(1)
        if(isEmpty() == true) // caso cola vacia
            front = tail = new QNode(d);
        else { // caso cola con 1 elemento o mas
            QNode n = new QNode(d);
            tail.next = n;
            tail = n;
        }
    }
    /* método desencolar */
    public int dequeue() { //O(1)
        if(isEmpty() == true) { // error, desencolar cola vacía
            System.out.println("Cola vacía");
            return -1;
        } else if(front == tail) { // caso cola con solo 1 elemento
            int a = front.data;
            front = tail = null;
            return a;
        } else { // caso cola con mas de un elemento
            int a = front.data;
            front = front.next;
            return a;
        }
    }
    /* Retornar el primero en la cola */
    public int front() {
        return front.data;
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        for(int i = 0; i < 10; ++i)
            q.enqueue(i);
        System.out.println(q.front());
        for(int i = 0; i < 10; ++i)
            q.dequeue();
        System.out.println(q.isEmpty());
    }
}