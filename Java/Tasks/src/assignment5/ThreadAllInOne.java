package assignment5;

public class ThreadAllInOne {
	public static void main(String[] args) {
		
		 	Thread thread1 = new A("Thread 1 - Same");
	        Thread thread2 = new A("Thread 2 - Different");

	        Thread thread3 = new Thread(new B("Thread 3 - Same"));
	        Thread thread4 = new Thread(new B("Thread 4 - Different"));
	        
	        thread1.start();
	        thread2.start();
	        thread3.start();
	        thread4.start();
		
		
	}
}
