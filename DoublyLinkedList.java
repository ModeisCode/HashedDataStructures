public class DoublyLinkedList {

    Node head;

    DoublyLinkedList(Object data) {
        head = new Node(data);
    }

    void insertToBeginning(Object data) {
        Node new_node = new Node(data);
        Node currNode = head;
        while (currNode.next != head) {
            currNode = currNode.next;
        }
        new_node.next = head;
        head = new_node;
    }

    void insertToEnd(Object data) {
        Node new_node = new Node(data);
        Node currNode = head;
        while (currNode.next.next != head) {
            currNode = currNode.next;
        }
        currNode.next = head;
    }

    void insertToMiddle(Object key,Object data) {
        Node new_node = new Node(data);
        Node currNode = head;
        while (currNode.next.data != data) {
            currNode = currNode.next;
        }
        Node nextOfCurrNode = currNode.next;
        new_node.next = nextOfCurrNode;
        currNode.next = new_node;
    }

    void deleteFromBeginning () {
        Node currNode = head;
        while (currNode.next.data != head) {
            currNode = currNode.next;
        }
        Node nextOfhead = head.next;
        currNode.next = nextOfhead;
        head = nextOfhead;
    }

    void deleteFromEnd() {
        Node currNode = head;
        while (currNode.next.next != head) {
            currNode = currNode.next;
        }
        currNode.next = head;
    }

    void deleteFromMiddle(Object data) {
        Node currNode = head;
        while (currNode.next.next.data != data) {
            currNode = currNode.next;
        }
        Node nextOfCurrNode = currNode.next.next;
        currNode.next = nextOfCurrNode;
    }




    void printList() {
        Node currNode = head;
        while (currNode.next != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    private class Node {
        Object data;
        Node next;
        Node(Object data) {
            data = data;
        }
    }

}
