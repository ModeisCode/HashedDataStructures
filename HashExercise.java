import java.util.HashSet;

public class HashExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hashtable = new HashSet();
		
		System.out.println(hashtable);
		
		hashtable.add("Paris");
		
		System.out.println(hashtable);
		
		hashtable.add("Adýyaman");
		
		System.out.println(hashtable);
		
		hashtable.add("Paris");
		
		System.out.println(hashtable);
		
		System.out.println(hashtable.size());
		
		for(String element: hashtable) {
			if(element.equals("Adýyaman")) {
				System.out.println(element.toUpperCase());
			}else {
				System.out.println(element);
			}
		}
		
		hashtable.add("Adana");
		
		System.out.println(hashtable);
		
		hashtable.add("Bursa");
		System.out.println(hashtable);
		
		hashtable.remove("Paris");
		System.out.println(hashtable);
		
		if(hashtable.contains("Adana")) {
			System.out.println("Hashtable contains Adana");
		}else {
			System.out.println("Hashtable does not contain Adana");
		}
		
		HashSet<String> hashtable2 = new HashSet();
		
		hashtable2.add("Roma");
		hashtable2.add("Napoli");
		hashtable2.add("Milano");
		
		System.out.println(hashtable2);
		
		hashtable.addAll(hashtable2);
		
		System.out.println(hashtable);
		
		
		
	}

}
