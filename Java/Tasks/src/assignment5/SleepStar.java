package assignment5;

import java.util.Scanner;

public class SleepStar{
	private static int rowNo;
	
	public SleepStar(int no) {
		rowNo = no;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter numbers of row :");
		int no = s.nextInt();
		
		SleepStar s1 = new SleepStar(no);
		Runnable t1= ()-> {
			for(int i=1; i<=rowNo;i++)
			{
				System.out.println("\n");
				for(int j=rowNo; j>=i;j--)
				{
					System.out.print("* ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
	new Thread(t1).start();
	
		
	}


	

//	@Override
//	public void run() {
//		
//		for(int i=1; i<=rowNo;i++)
//		{
//			System.out.println("\n");
//			for(int j=rowNo; j>=i;j--)
//			{
//				System.out.print("* ");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
}
