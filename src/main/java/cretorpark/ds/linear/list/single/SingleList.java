package cretorpark.ds.linear.list.single;


public class SingleList {
    protected SingleNode head;

    public void add(SingleNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            SingleNode prevNode = head;

            while (prevNode.next != null) {
                prevNode = prevNode.next;
            }
            prevNode.next = newNode;
        }
    }

    public void add(int index, SingleNode newNode) {
        if (index < 0) return;

        if (head == null) {
            head = newNode;
        } else {
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                SingleNode prevNode = head;
                for (int i = 1; i < index; i++) {
                    prevNode = prevNode.next;
                    //	if ( prevNode.getNext() == null ) break;
                }
                newNode.next = prevNode.next;
                prevNode.next = newNode;
            }
        }
    }

    public boolean remove(int index) {
        if (index < 0) return false;

        if (head == null) {
            return false;
        } else {
            if (index == 0) {
                head = head.next;
            } else {
                SingleNode prevNode = head;
                for (int i = 1; i < index; i++) { // 1번째 index를 삭제할 경우.  loop를 빠져나와서 바로 next처리하면 되자나. 그래서
                    prevNode = prevNode.next;
                }
                prevNode.next = prevNode.next.next;
            }
        }

        return true;
    }

    public Object get(int index) {

        if (index < 0) return null;

        if (head == null) {
            return null;
        } else {
            SingleNode currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }


    public String toString() {
        SingleNode currentNode = head;

        StringBuffer sb = new StringBuffer();

        while (currentNode != null) {
            sb.append(currentNode.data);
            sb.append(", ");
            currentNode = currentNode.next;
        }

        if (sb.length() > 0) {
            int i = sb.lastIndexOf(", ");
            sb.delete(i, i + 2);
        }
        return "[" + sb + "] ";
    }
}
