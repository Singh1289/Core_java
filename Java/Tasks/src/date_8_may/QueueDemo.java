package date_8_may;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue q =new PriorityQueue();
	
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
	}
}






