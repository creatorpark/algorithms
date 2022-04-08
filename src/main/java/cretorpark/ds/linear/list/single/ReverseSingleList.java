package cretorpark.ds.linear.list.single;


public class ReverseSingleList extends SingleList {

    //TODO 역순으로 값찾기

    //역순으로 바꾸기
    public void reverseNode() {

        SingleNode currentNode = head;
        SingleNode prevNode = null;
        SingleNode nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    public String reverseIndex(int reverseIndex) {
        return "";
    }

}
