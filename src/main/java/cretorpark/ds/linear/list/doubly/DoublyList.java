package cretorpark.ds.linear.list.doubly;

// https://velog.io/@jha0402/Data-structure-%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%9D%BC%EB%A9%B4-%EA%BC%AD-%EC%95%8C%EC%95%84%EC%95%BC-%ED%95%A0-7%EA%B0%80%EC%A7%80-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0
public class DoublyList {
    protected DoublyNode head;

    public void add(DoublyNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode lastNode = head;
            // 가장 마지막에 삽입, 삽입시 N차 순회가 일어난다.
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
        }
    }

    public void add(int index, DoublyNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            if (index == 0) {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            } else {
                DoublyNode prevNode = head;
                for (int i = 1; i < getLastIndex(index); i++) {
                    prevNode = prevNode.next;
                }
                newNode.prev = prevNode;
                newNode.next = prevNode.next;
                prevNode.next = newNode;
            }
        }
    }

    public boolean remove(int index) {
        DoublyNode prevNode = head;

        if (index < 0) return false;
        if (index > getLastIndex(index)) return false;

        if (index == 0) {
            head = prevNode.next;
            head.prev = null;
        } else {
            // index 0 이후부터 검색
            for (int i = 1; i < index; i++) {
                prevNode = prevNode.next;
            }
            DoublyNode nextNode = prevNode.next.next;
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
        }

        return true;
    }

    public Object get(int index) {
        DoublyNode targetNode = head;

        if (index < 0) return null;
        if (index > getLastIndex(index)) return null;

        for (int i = 0; i < index; i++) {
            targetNode = targetNode.next;
        }
        return targetNode.data;
    }

    public int getSize() {
        int size = 0;
        DoublyNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public int getLastIndex(int index) {
        int lastIndex = index;
        int size = getSize();
        if ((size - 1) < index) lastIndex = size - 1;
        return lastIndex;
    }

    public String toString() {
        DoublyNode current = head;

        StringBuffer sb = new StringBuffer();

        while (current != null) {
            sb.append(current.data);
            sb.append(", ");
            current = current.next;
        }
        if (sb.length() > 0) {
            int i = sb.lastIndexOf(", ");
            sb.delete(i, i + 2);
        }
        return "[" + sb + "], " + getSize();
    }
}
