package cretorpark.ds.linear.list.doubly;

public class DoublyNode {

    Object data;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public DoublyNode(Object data, DoublyNode next, DoublyNode prev) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data.toString();
    }
}
