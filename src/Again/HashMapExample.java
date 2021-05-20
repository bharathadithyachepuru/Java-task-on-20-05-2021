package Again;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		 HashMap<String, Integer> map = new HashMap<>();
		 
		    map.put("Bharath", 10);
	        map.put("Adithya", 30);
	        map.put("kareem", 20);
	        
	        System.out.println("Size of map is:" + map.size());
             System.out.println(map);
             
             if (map.containsKey("Bharath")) {
            	 
                 Integer a = map.get("Bharath");
                 System.out.println("value for key"+ " \"Bharath\" is: " + a);
             }

	}

}
