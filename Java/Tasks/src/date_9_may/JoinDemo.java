package date_9_may;

public class JoinDemo implements Runnable {


	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			
				System.out.println(i+"-->"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new JoinDemo());
		Thread t2 = new Thread(new JoinDemo());
		Thread t3 = new Thread(new JoinDemo());
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
	}
}
