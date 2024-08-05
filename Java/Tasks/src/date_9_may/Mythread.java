package date_9_may;

public class Mythread extends Thread{
	public void run() {
		System.out.println("Thread="+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();                               
		Mythread t3 = new Mythread();
		t1.start();
		t2.start();
		t3.start();
		
	}
}
