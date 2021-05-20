package Again;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapExample {

	public static void main(String[] args) {

    LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
 
       lhmap.put(2, "Bharath");
        lhmap.put(37, "Adithya");
       lhmap.put(1, "Kareem");
       lhmap.put(4, "Sumanth");
       lhmap.put(56, "Phani");
       
       Set set = lhmap.entrySet();
       
       Iterator iterator = set.iterator();
       while(iterator.hasNext()) {
    	   
          Map.Entry me = (Map.Entry)iterator.next();
          System.out.print("Key is: "+ me.getKey() + "& Value is: "+me.getValue()+"\n");
       }

	}

}
