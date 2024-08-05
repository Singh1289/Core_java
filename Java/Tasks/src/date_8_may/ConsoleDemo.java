package date_8_may;

import java.io.Console;

public class ConsoleDemo {
		public static void main(String[] args) {
			Console c = System.console();
			System.out.println("Enter Name:");
			String Name = c.readLine();
			System.out.print("Welcome  "+Name);
			System.out.print("Enter Password:");
			char [] pwd =c.readPassword();
			String str =String.valueOf(pwd);
			System.out.println("Password:"+str);
			
		}
}
