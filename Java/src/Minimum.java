import java.util.Scanner;

public class Minimum {

	public int mini(int a,int b,int c) {
		return (a<b)&&(a<c)?a:(b<c)?b:c;
	}
	public int maxx(int a,int b,int c) {
		return (a>b)&&(a>c)?a:(b>c)?b:c;
	}
	public static void main(String[] args) {
		Minimum m = new Minimum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three Values : ");
		int first = s.nextInt();
		int second = s.nextInt();
		int third = s.nextInt();
		
		System.out.println("Minimum Value Out of Three is :"+m.mini(first, third, second));
		System.out.println("Maximum Value Out of Three is :"+m.maxx(first, third, second));
	}
}
