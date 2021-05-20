package Again;

public class MultiThreadingExample implements Runnable {

	public static void main(String[] args) {

		Thread mythread = new Thread("Bharath");
		Thread thread  = new Thread("Adithya");
		
		mythread.start();
		thread.start();
		
		System.out.println("Thread names:");
		
		System.out.println(mythread.getName());
		System.out.println(thread.getName());
		
	}

	@Override
	public void run() {
		
		
	}
	
}
