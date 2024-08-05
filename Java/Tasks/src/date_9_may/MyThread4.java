package date_9_may;
public class MyThread4 {
	public static void main(String[] args) {

		Runnable r = ()->{
			int sum=0;
			for(int i=1;i<=15;i++) {
				sum+=i;
			}
			System.out.println("Sum ="+sum);
		};
		new Thread (r).start();
	}
}





