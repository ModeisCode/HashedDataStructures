import javax.xml.crypto.Data;

public class HashOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hashTable = new HashMap();
		
		DataItem item1 = new DataItem(312, "Ahmet");
		DataItem item2 = new DataItem(412, "Emre");
		DataItem item3 = new DataItem(311, "Murat");
		
		hashTable.putItem(item1);
		hashTable.putItem(item2);
		hashTable.putItem(item3);


		
		
		DataItem item4 = new DataItem(211, "Metin");
		hashTable.putItem(item4);
		hashTable.printTable();
	}

}
