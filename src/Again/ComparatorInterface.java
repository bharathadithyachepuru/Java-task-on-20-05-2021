package Again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	
    int rollno;
    String name, address;
  
    
    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
  
    
    public String toString()
    {
        return this.rollno + " " + this.name + " "+ this.address;
    }
}
  
class Sortbyroll implements Comparator<Student> {
    
 
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
  
class Sortbyname implements Comparator<Student> {
    
  
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

public class ComparatorInterface {

	public static void main(String[] args) {

		ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(10, "Bharath", "Hyderabad"));
        ar.add(new Student(20, "Adithya", "Khammam"));
        ar.add(new Student(30, "Kareem", "Kurnool"));
  
        System.out.println("Unsorted");
        
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyroll());
  
        System.out.println("\nSorted by rollno");
        
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyname());
  
        System.out.println("\nSorted by name");
        
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

	}

}
