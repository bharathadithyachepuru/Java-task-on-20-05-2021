package Again;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {

		Enumeration names;
		   String key;
		   
		   Hashtable<String, String> hashtable = new Hashtable<String, String>();
		   
		   hashtable.put("Key1","Bharath");
		   hashtable.put("Key2","Adithya");
		   hashtable.put("Key3","kareem");
		   hashtable.put("Key4","Sumanth");
		   hashtable.put("Key5","Phani");
		   
		   names = hashtable.keys();
		   while(names.hasMoreElements()) {
			   
		      key = (String) names.nextElement();
		      System.out.println("Key: " +key+ " & Value: " +hashtable.get(key));
		   }

	}

}
