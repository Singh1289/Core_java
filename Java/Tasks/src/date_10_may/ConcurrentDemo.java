package date_10_may;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentDemo extends Thread {
	static ArrayList l = new ArrayList();
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child Thread updating list"+ l);
		l.add("E");
		System.out.println("List :"+l);
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		ConcurrentDemo d1 = new ConcurrentDemo();
		d1.start();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			String str = (String)itr.next();
			System.out.println("Main thread iterating :"+str);
			Thread.currentThread().sleep(1000);
		}
		System.out.println("list :"+l);
		
		
	}

}
