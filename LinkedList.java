

public class LinkedList {

	Node head;
	
	class Node {

		String data;
		Node next;
		
		Node(String d){
			
			data = d;
			next = null;
		}
	}

	public void insertToEnd(String data) {
		
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(this.head==null) {
			this.head = new_node;
		}else {
			Node last = this.head;
			while(last.next!=null) {
				last = last.next;
			}
			
			last.next = new_node;
		}
		
	
	}
	
	public void printList() {
		
		Node currNode = this.head;
		
		while(currNode != null) {
			
			System.out.print(currNode.data + " ");
			
			currNode = currNode.next;
		}
	}
	

}
