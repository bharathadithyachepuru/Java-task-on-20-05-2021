package Again;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Empinfo implements Serializable {
	
	String empname;
	int empid;
	
	public Empinfo(String n, int id) {
		
	   this.empname = n;
	   this.empid = id;
	}
}

public class SerializationExample {

	public static void main(String[] args) throws IOException {

		try {
			
			Empinfo ei = new Empinfo("BharathAdithya", 1551);
			FileOutputStream fos = new FileOutputStream("Employee.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(ei);
			os.close();
			
		} catch (IOException e) {
			
		   System.out.println(e);
		}

	}

}
