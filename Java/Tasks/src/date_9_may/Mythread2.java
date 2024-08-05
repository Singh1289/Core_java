package date_9_may;
public class Mythread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) 
		{
			System.out.println(i+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}	
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Mythread2 m1 = new Mythread2();
		 Thread t1 = new Thread(m1);
		 
		 Mythread2 m2 = new Mythread2();
		 Thread t2 = new Thread(m2);
		 
		 Mythread2 m3 = new Mythread2();
		 Thread t3 = new Thread(m3);
		 
		 Mythread t4 = new Mythread();
		 t1.setName("one");
		 t2.setName("Two");
		 t3.setName("Three");
		 t4.setName("404");
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
	}
}
