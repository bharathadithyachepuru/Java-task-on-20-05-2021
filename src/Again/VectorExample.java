package Again;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		    v.add("A"); 
		    v.add("B"); 
		    v.add("C"); 
		    v.add("D"); 
		    v.add("E");
		    
		    Enumeration<String> en = v.elements(); 
		    System.out.println("Vector elements are: "); 
		    
		    while(en.hasMoreElements())
		    { 
		 
		     Object obj = en.nextElement(); 
		     System.out.println(obj);

		     v.removeElementAt(4); 
		     v.add(4, "G");
		     
		     System.out.println("Vector list after adding elements during Iteration"); 
		     System.out.println(v);
		     
		    }
		  }
	}
