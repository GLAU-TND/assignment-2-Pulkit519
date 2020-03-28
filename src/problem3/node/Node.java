package problem3.node;

public class Node<T> {

    private T data;
    private Node next;
    private int priority;

    public Node(T data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString(){
        return data.toString();
    }
}