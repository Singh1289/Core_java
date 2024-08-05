package date_9_may;

public class YieldDemo implements Runnable{


	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			if(i==2) Thread.yield();
			else
				System.out.println(i+"-->"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new YieldDemo());
		Thread t2 = new Thread(new YieldDemo());
		Thread t3 = new Thread(new YieldDemo());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
/*
  yield is the method of Thread class
  	- pause the currently executing thread object to temporarily 
  		pause and allow other threads to execute.
  		
  		
  check other methods:-
  	-join()  this methods waits for a thread to terminate
  			to do this invoke join() on the thread object.
  			
  	- interrupt()
  	- interrupted()
  	- isAlive();
  	- currentThread()
  	- sleep()
  	- start()
  	*/
  	
