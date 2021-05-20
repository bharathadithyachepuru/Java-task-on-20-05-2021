package Again;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<String>();
		
		 list.add("Bharath");
	     list.add("Adithya");
	     list.add("Kareem");
	     
	     list.addFirst("Chetan");
	     
	     list.addLast("Phani");
	     
	     list.add(2, "Vinay");
	     
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }

	}

}
