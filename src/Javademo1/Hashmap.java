package Javademo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> map = new HashMap<>();

	        // Add key-value pairs to the HashMap
	        map.put("Alice", 25);
	        map.put("Bob", 30);
	        map.put("Charlie", 20);

	        // Retrieve values based on keys
	        System.out.println("Alice's age is: " + map.get("Alice"));
	        System.out.println("Bob's age is: " + map.get("Bob"));
	        System.out.println("Charlie's age is: " + map.get("Charlie"));
	        
	        //sorting the values
	        List<Integer> values = new ArrayList<>(map.values());
	        Collections.sort(values);

	        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	        for (Integer value : values) {
	            for (Map.Entry<String, Integer> entry : map.entrySet()) {
	                if (entry.getValue().equals(value)) {
	                    sortedMap.put(entry.getKey(), value);
	                }
	            }
	        }
	        System.out.println("Sorted HashMap by values: " + sortedMap);
	}

}
