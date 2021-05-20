package Again;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		 ArrayList<String> obj = new ArrayList<String>();
		 
		 obj.add("Bharath");
	      obj.add("Adithya");
	      obj.add("Kareem");
	      obj.add("Sumanth");
	      
	      
	      System.out.println("Original ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	      
	      obj.add(0, "Goutham");
	      obj.add(1, "Ravindar");
	      
	      System.out.println("ArrayList after adding:");
	      for(String str:obj)
	         System.out.println(str);
	      
	      obj.remove("Kareem"); 
	      obj.remove("Sumanth"); 
	      
	      System.out.println("ArrayList after removing:");
	      for(String str:obj)
	         System.out.println(str);

	      obj.remove(1);
	      
	      System.out.println("Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);


	}

}
