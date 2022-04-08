package cretorpark.ds.linear.list.single;

public class SingleNode {

    Object data;
    SingleNode next;

    public SingleNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public SingleNode(Object data, SingleNode next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data.toString();
    }
}
