package Again;

public class StringBufferExample {

	public static void main(String[] args) {
		
		//Difference between String and String Buffer in java

		String str = "Bharath";
		
		str.concat("Adithya");
		
		System.out.println(str); //String value cant be changed once its initialised
		
		
		StringBuffer sb = new StringBuffer("Bharath");
		
		sb.append("Adithya");
		
		System.out.println(sb);//String value can be changed even after initialisation 

	}

}
