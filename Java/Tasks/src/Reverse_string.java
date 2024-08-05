import java.util.Scanner;

public class Reverse_string {

	public static String reverseString(String str) 
	{		
        char[] ca = str.toCharArray();
        int left = 0;
        int right = ca.length - 1;
        
        while (left < right) 
        {            
            char temp = ca[left];
            ca[left] = ca[right];
            ca[right] = temp;            
        
            left++;
            right--;
        }
        return new String(ca);
	}
     
	public static void main(String []args) {
		Reverse_string rs= new Reverse_string();
		Scanner se = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String input = se.nextLine();
		
		String output = reverseString(input);
		
		System.out.println("new string : "+ output);
	}
}