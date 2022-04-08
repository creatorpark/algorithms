package cretorpark.ds.linear.list.poly;

import java.util.ArrayList;

public class PolyList {
    protected PolyNode head;

    public void add(PolyNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            PolyNode currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public PolyList addPoly(PolyList polyLinkedList) {
        PolyList result = new PolyList();
        PolyNode cursorA = head;
        PolyNode cursorB = polyLinkedList.get(0);
        PolyNode newNode = null;
        while (cursorA != null && cursorB != null) {
            if (cursorA.exponent == cursorB.exponent) {
                newNode = new PolyNode(cursorA.coefficient + cursorB.coefficient, cursorA.exponent);
                cursorA = cursorA.next;
                cursorB = cursorB.next;
                result.add(newNode);
            } else if (cursorA.exponent > cursorB.exponent) {
                newNode = new PolyNode(cursorA.coefficient, cursorA.exponent);
                cursorA = cursorA.next;
                result.add(newNode);
            } else if (cursorA.exponent < cursorB.exponent) {
                newNode = new PolyNode(cursorB.coefficient, cursorB.exponent);
                cursorB = cursorB.next;
                result.add(newNode);
            }
        }
        while (cursorA != null) {
            result.add(cursorA);
            cursorA = cursorA.next;
        }

        while (cursorB != null) {
            result.add(cursorB);
            cursorB = cursorB.next;
        }
        return result;
    }

    public PolyNode get(int index) {
        if (index < 0) return null;

        PolyNode currentNode = head;
        if (index == 0) {
            return currentNode;
        } else {
            for (int i = 1; i <= index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }

    public String toString() {
        PolyNode currentNode = head;
        StringBuffer sb = new StringBuffer();
        while (currentNode != null) {
            sb.append(currentNode.toString());
            if (currentNode.next != null) {
                sb.append(" + ");
            }
            currentNode = currentNode.next;
            ArrayList<String> a = new ArrayList<String>();
        }
        return sb.toString();
    }
}
