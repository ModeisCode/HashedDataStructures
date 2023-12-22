public class Stack {

    Node top;

    int capacity = 0;
    int numberOfNodes = 0;

    boolean validation = false;

    Stack(int capacity) {
        capacity = capacity;
    }

    void checkIfBalanced(String example) {

        boolean isBalanced = true;
        String all_paranthesis = "(){}[]";
        int count = 0;
        for (int i = 0; i < example.length(); i++) {
            char c = example.toCharArray()[i];
            if (all_paranthesis.contains(String.valueOf(c)))
                count++;
        }

        if (count % 2 != 0)
            isBalanced = false;

        String opening_paranthesis = "({[";
        String closing_paranthesis = ")}]";
        char[] example_char_arr = example.toCharArray();
        for (int i = 0; i < example.length(); i++) {
            if (isBalanced == false)
                break;
                if (opening_paranthesis.contains(String.valueOf(example_char_arr[i]))) {
                    this.push(new Node(example_char_arr[i]));
                }
                else if (closing_paranthesis.contains(String.valueOf(example_char_arr[i]))) {
                    if (this.isEmpty()) {
                        //System.out.println("Expression is not balanced");
                        isBalanced = false;
                        break;
                    }
                    else {
                        Node popped = this.pop();
                        if (popped.data == null)
                            continue;
                        if ((char)popped.data != getOpening(example_char_arr[i])) {
                            System.out.println("ERROR");
                            isBalanced = false;
                            break;
                        }
                        else {
                            isBalanced = true;
                        }
                    }
                }


        }


        if (isBalanced == false)
            System.out.println("Expression is not balanced");
        else
            System.out.println("Expression is balanced");


    }

    private char getOpening(char closing) {
        switch (closing) {
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return ' '; // This should never happen
        }
    }

    boolean isEmpty() {
        if (top == null)
            return true;
        return false;
    }

    void push(Object data) {
        Node new_node = new Node(data);
        if (this.peek() != null) {
            if (numberOfNodes >= capacity)
                System.out.println("StackOverflow!");
            else {
                numberOfNodes++;
                System.out.println("node has pushed " + new_node.data);
                new_node.next = top;
                top = new_node;
            }
        }
        else {
            top = new_node;
        }
    }


    Node pop() {
        if (this.peek() != null) {
            Node top_ = top;
            top = top.next;
            numberOfNodes--;
            return top_;
        }
        return null;
    }


    Node peek() {
        if (top == null){
            System.out.println("Stack is empty!");
            return null;
        }
        else
            return top;
    }

    public void print() {
        Node curr = top;
        while (curr.next != null) {

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
