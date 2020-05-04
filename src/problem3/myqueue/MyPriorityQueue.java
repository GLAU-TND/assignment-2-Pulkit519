package problem3.myqueue;
import problem3.node.Node;

import java.util.NoSuchElementException;

public class MyPriorityQueue<T> {
    private Node front;
    private Node back;

    public <T>void enQueue(T data,int priority){
        Node node = new Node(data,priority);
        if(isEmpty() || node.getPriority() < front.getPriority()){
            node.setNext(front);
            front = node;
        }
        else {
            Node previous = null;
            Node current = front;
            while(current != null && current.getPriority() <=  node.getPriority()){
                previous = current;
                current = current.getNext();
            }
            node.setNext(previous.getNext());
            previous.setNext(node);
        }
    }

    public T deQueue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node removeNode = front;
        front = front.getNext();
        return (T)removeNode.getData();
    }

    public void printQueue(){
        Node current = front;
        while(current != null){
            System.out.println(current);
            current = current.getNext();
        }
    }


    public boolean isEmpty(){
        return front == null;
    }

}