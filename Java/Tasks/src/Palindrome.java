import java.util.Scanner;

public class Palindrome {

	public static boolean check(String str) 
	{
		boolean ch = true;
        char[] ca = str.toCharArray();
        int left = 0;
        int right = ca.length - 1;
        
        while (left < right) 
        {            
            if(ca[left]!= ca[right]) 
            {
            	ch= false;
            	break;
            }       
            left++;
            right--;
        }
        return ch;
	}
	
	public static void main(String []args)
	{
		Palindrome pl = new Palindrome();
		char ch='Y';
		Scanner se = new Scanner(System.in);
		while(ch=='Y'|| ch =='y') {
			System.out.print("Enter a word : ");
			String input = se.nextLine();
			if(check(input))
			System.out.println("Word is Palindrome");
			else
			System.out.println("Word is not Palindrome");
			
		System.out.print("Do you want to check another word (Y/N) : ");
		ch = se.next().charAt(0); 
		}
	}
	
}
