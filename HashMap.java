
public class HashMap {
	
	LinkedList[] hashtable;
	LinkedList list1;
	LinkedList list2;
	LinkedList list3;
	LinkedList list4;
	LinkedList list5;
	LinkedList list6;
	LinkedList list7;
	LinkedList list8;
	LinkedList list9;
	LinkedList list0;
	
	
	
	public HashMap() {
		
		this.list1 = new LinkedList();
		this.list2 = new LinkedList();
		this.list3 = new LinkedList();
		this.list4 = new LinkedList();
		this.list5 = new LinkedList();
		this.list6 = new LinkedList();
		this.list7 = new LinkedList();
		this.list8 = new LinkedList();
		this.list9 = new LinkedList();
		this.list0 = new LinkedList();
		this.hashtable = new LinkedList[10];
		fillHashtable();
		
	}

	public void fillHashtable() {
		
		this.hashtable[0]=this.list0;
		this.hashtable[1]=this.list1;
		this.hashtable[2]=this.list2;
		this.hashtable[3]=this.list3;
		this.hashtable[4]=this.list4;
		this.hashtable[5]=this.list5;
		this.hashtable[6]=this.list6;
		this.hashtable[7]=this.list7;
		this.hashtable[8]=this.list8;
		this.hashtable[9]=this.list9;
	}
	
	public void putItem(DataItem newItem) {
		
		int index = newItem.key % 10;
		hashtable[index].insertToEnd(newItem.data);
		
		
	}
	
	public void printTable() {
		
		for(int i=0; i<this.hashtable.length; i++) {
			
			System.out.print(i + " --> ");
			this.hashtable[i].printList();
			System.out.println();
		}
	}
	
	
}
