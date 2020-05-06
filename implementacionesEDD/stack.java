package edd;
public class Stack {
    SNode top;
    public class SNode {
        int data; 
        SNode next;
        SNode(int d) {data = d;}
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int top() {
        return top.data;
    }
    public void push(int d) {
        if(top == null) 
            top = new SNode(d);
        else {
            SNode n = new SNode(d);
            n.next = top;
            top = n;
        }
    }
    public int pop() {
        if(top == null) {
            System.out.println("Stack vacío");
            return -1;
        } else if(top.next == null) {
            int a = top.data;
            top = null;
            return a;
        } else {
            int a = top.data;
            top = top.next;
            return a;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        for(int i = 0; i < 10; ++i)
            s.push(i);
        System.out.println(s.top());
        for(int i = 0; i < 10; ++i)
            s.pop();
        System.out.println(s.isEmpty());
    }
}