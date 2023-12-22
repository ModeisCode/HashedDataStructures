import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashmap = new HashMap();
		
		if(hashmap.isEmpty()) {
			System.out.println("HashMap is empty!!");
		}else {
			System.out.println("HashMap is not empty!!");
		}
		
		hashmap.put("Okan", 20);
		
		System.out.println(hashmap);
		
		hashmap.put("Furkan", 25);
		hashmap.put("Fýrat", 16);
		
		System.out.println(hashmap);
		
		hashmap.put("Okan", 21);
		
		System.out.println(hashmap);
		
		System.out.println(hashmap.get("Fýrat")); 
		
		System.out.println(hashmap.containsKey("Yiðit"));
		System.out.println(hashmap.containsValue(25));
		
		
		hashmap.remove("Fýrat");
		System.out.println(hashmap);
		
		System.out.println(hashmap.size());
		System.out.println(hashmap.values());
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.entrySet());
		
		Iterator<Entry<String, Integer>> hmIterator = hashmap.entrySet().iterator();
		
		
		while(hmIterator.hasNext()) {
			Map.Entry<String, Integer> mapElement = (Map.Entry<String, Integer>)hmIterator.next();
			System.out.println(mapElement.getValue());
		}
	}
}
