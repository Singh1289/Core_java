package date_9_may;

public class ThreadGroup1  {
	
		public static void main(String[] args) {
		ThreadGroup tg = new  ThreadGroup("Parent Group");
		ThreadGroup th = new ThreadGroup(tg,"Child Group");
		System.out.println(tg.getParent().getName());    								  //main
		System.out.println(th.getParent().getName());									  //Parent Group
		System.out.println(Thread.currentThread().getName());							  //main
		System.out.println(Thread.currentThread().getThreadGroup().getName());			  //main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system
	}
}
