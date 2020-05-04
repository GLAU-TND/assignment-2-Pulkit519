package problem4.element;

public class Element<T> {
    private T node;
    private T preOrderSuccessor;
    private Element next;

    public Element(T node, T preOrderSuccessor) {
        this.node = node;
        this.preOrderSuccessor = preOrderSuccessor;
    }

    public T getNode() {
        return node;
    }

    public void setNode(T node) {
        this.node = node;
    }

    public T getPreOrderSuccessor() {
        return preOrderSuccessor;
    }

    public void setPreOrderSuccessor(T preOrderSuccessor) {
        this.preOrderSuccessor = preOrderSuccessor;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}