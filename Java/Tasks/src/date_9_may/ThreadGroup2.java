package date_9_may;

public class ThreadGroup2 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("tg");
		Thread t1=new Thread(tg,"one");
		Thread t2=new Thread(tg,"Two");
		Thread t3=new Thread(tg,"Three");
		 tg.setMaxPriority(6); //6
		 Thread t4=new Thread(tg,"Four"); 
		 
		 System.out.println(t1.getPriority());
		 System.out.println(t2.getPriority());
		 System.out.println(t3.getPriority());
		 System.out.println(t4.getPriority());
		 
		 
	}
}
