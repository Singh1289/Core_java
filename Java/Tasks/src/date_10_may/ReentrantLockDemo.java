package date_10_may;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo extends Thread{
	static ReentrantLock l = new ReentrantLock();
	
	public ReentrantLockDemo (String name) {
		super(name);
	}
	
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName()+"  Got lock and performing");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l.unlock();
	}else {
		System.out.println(Thread.currentThread().getName()+"Performing Alternate task");
	}
   }
		
	
	public static void main(String[] args) throws InterruptedException {
		ReentrantLockDemo t1 = new ReentrantLockDemo("one");
		ReentrantLockDemo t2 = new ReentrantLockDemo("two");
		ReentrantLockDemo t3 = new ReentrantLockDemo("three");
		
		t1.start();
		//Thread.sleep(1000);
		t2.start();
		Thread.sleep(1000);
		t3.start();
		
		
	}
}
