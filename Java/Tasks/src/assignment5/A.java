package assignment5;

public class A extends Thread{
	private String task;
	public A(String str) {
		task= str;
	}
	public void run() {
        System.out.println(task + " started.");
        for (int i = 1; i <=3; i++) {
		    System.out.println(task + ": " + i);
		    //Thread.sleep(1000); 
		    Thread.yield();
		}
        System.out.println(task + " completed.");
    }

}
