package Again;

class UnBoxingExample {
	
	 public static void myMethod(int num) {
		 
		 System.out.println(num);
	 }
		
	 public static void main(String[] args) {

		 Integer inum = new Integer(100);
		 
		 myMethod(inum);

	}

}
