public class Queue {

    Node rear;
    Node front;
    int capacity;
    int numberOfNodes = 0;

    void enqueueChain(int[] datas) {
        for (Object data : datas) {
            enqueue(data);
        }
    }

    void enqueue(Object data) {
        Node new_node = new Node(data);
        if (front == null) {
            front =  new_node;
            rear = new_node;
        }
        else {
            Node currNode = front;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new_node;
            rear = new_node;
        }
    }

    void enqueue(Node new_node) {
        if (front == null) {
            front =  new_node;
            rear = new_node;
        }
        else {
            Node currNode = front;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new_node;
            rear = new_node;
        }
    }

    Node dequeue() {
        if (!isEmpty() && front.next != null) {
             Node front_ = front;
             front = front.next;
             return front_;
        }
        else if (!isEmpty()) {
            Node front_ = front;
            front = null;
            return front;
        }
        return null;
    }


    boolean isEmpty() {
        return front == null;
    }

    int size() {
        int counter=0;
        if(this.front==null) {
            return counter;
        }else {
            Node currentNode = this.front;
            while(currentNode.next!=null) {
                counter++;
                currentNode = currentNode.next;
            }
            return counter+1;
        }
    }

    Node getRear() {
        return rear;
    }

    Node getFront() {
        return front;
    }

    void printQueue() {
        if(this.front==null) {
            System.out.println("queue is empty");
        }else {
            System.out.print("front: ");
            Node currentNode = this.front;
            while(currentNode.next!=null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;

            }
            System.out.print(currentNode.data + " ");
            System.out.println(" :rear");
        }

    }

    public static void merge(Queue queue1,Queue queue2,Queue queue3) {

        int size_of_queue1 = queue1.size();
        int size_of_queue2 = queue2.size();
        // 5,7,8,12,20
        // 4,9,13,25,30
        boolean last_enqueue = false;
        for (int i = 0; i < size_of_queue1; i++) {
            Node node = queue1.front;
            for (int j = 0; j < size_of_queue2; j++) {
                if ((int)node.data > (int)queue2.front.data) {
                    Node temp = queue2.dequeue();

                    queue3.enqueue(temp.data);
                }
                else {
                    queue3.enqueue(node.data);
                    if (queue1.front.next == null && queue2.front != null)
                        queue3.enqueue(queue2.dequeue());
                   break;
                }

                System.out.println("queue1");
                queue1.printQueue();
                System.out.println("queue2");
                queue2.printQueue();
                System.out.println("queue3");
                queue3.printQueue();
            }
            queue1.dequeue();
        }


    }



    private class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
        }
    }
}
