package date_9_may;

public class MyThread3 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				int sum=0;
				for(int i=1;i<=5;i++) {
					sum+=i;
				}
				System.out.println("Sum ="+sum);
				
			}
			
		};
		new Thread (r).start();
	}
}
