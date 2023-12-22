public class Main {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue();
        Queue queue3 = new Queue();
        int[] queue1_items = new int[]{5,7,8,12,20};
        int[] queue2_items = new int[]{4,9,13,25,30};
        queue1.enqueueChain(queue1_items);
        queue2.enqueueChain(queue2_items);
        queue3.merge(queue1,queue2,queue3);
        queue3.printQueue();
    }

}