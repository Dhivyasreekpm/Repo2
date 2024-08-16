package Javademo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapValues {
	 public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("A", 5);
	        map.put("B", 2);
	        map.put("C", 8);
	        map.put("D", 3);

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
