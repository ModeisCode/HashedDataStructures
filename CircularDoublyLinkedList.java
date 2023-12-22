public class CircularDoublyLinkedList {

    Node head;

    CircularDoublyLinkedList(Object head_data) {
        head = new Node(head_data);
    }


    void insertToBeginning(Object data) {
        Node new_node = new Node(data);
        Node currNode = head;
        while (currNode.next != head) {
            currNode = currNode.next;
        }
        new_node.prev = currNode;
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }

    void insertToEnd(Object data) {
        Node new_node = new Node(data);
        Node currNode = head;
        while (currNode.next.next != head) {
            currNode = currNode.next;
        }
        Node tail = currNode.next;
        tail.next = new_node;
        currNode.prev = tail;
        currNode.next = head;
        head.prev = currNode;
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
        new_node.prev = currNode;
        nextOfCurrNode.prev = new_node;
    }

    void deleteFromBeginning () {
        Node currNode = head;
        while (currNode.next.data != head) {
            currNode = currNode.next;
        }
        Node nextOfhead = head.next;
        currNode.next = nextOfhead;
        head = nextOfhead;
        nextOfhead.prev = currNode;
    }

    void deleteFromEnd() {
        Node currNode = head;
        while (currNode.next.next != head) {
            currNode = currNode.next;
        }
        currNode.next = head;
        head.prev = currNode;
    }

    void deleteFromMiddle(Object data) {
        Node currNode = head;
        while (currNode.next.next.data != data) {
            currNode = currNode.next;
        }
        Node nextOfCurrNode = currNode.next.next;
        currNode.next = nextOfCurrNode;
        nextOfCurrNode.prev = currNode;
    }


    void printList() {
        Node currNode = head;
        while (currNode.next != head) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }



    private class Node {
        Object data;
        Node next;
        Node prev;
        Node(Object data) {
            data = data;
        }
    }

}
