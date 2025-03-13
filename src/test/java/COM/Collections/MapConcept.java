package COM.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Difference between and HashMap and HashTable-> HashMap don't allow duplicates for keys but allowed in values
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Shanmuga", 12345);
		hm.put("Somu", 11111);
		hm.put("Sundaram", 22222);
		hm.put("Murali", 77777);
		hm.put("Ravi", 55555);
		hm.put("Ravi", 66666);

		
		for (Map.Entry<String, Integer> map:hm.entrySet()) {
			
			System.out.println(map.getKey()+" "+map.getValue());
		}
		/*
		 * for (int i = 0; i < hm.size(); i++) { if (hm.containsValue(11111)) {
		 * System.out.println(hm.entrySet()); } }
		 */
	}

}
