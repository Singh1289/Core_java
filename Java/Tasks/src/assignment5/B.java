package assignment5;

public class B implements Runnable{
	private String task;
	public B(String str) {
		task= str;
	}
	
	@Override
	public void run() {
		System.out.println(task + " started.");
        try {
           
            for (int i = 1; i <=3; i++) {
                System.out.println(task + ": " + i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(task + " completed.");
	}

}
