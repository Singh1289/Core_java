package date_8_may;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner se= new Scanner(System.in);
		String str = se.nextLine();
		System.out.println(str);
		Student s1 = new Student(101,"Ravi");
		Student s2 = new Student(102,"Rahul");
		Student s3 = new Student(103,"Raju");
		FileOutputStream fos = new FileOutputStream("c:\\javafile\\test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		fos.close();
		oos.close();
		System.out.println("Done..!!!");
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("c:\\javafile\\test.txt"));
		
		Student ss = (Student) ois.readObject() ;
		Student ss1 = (Student) ois.readObject() ;
		Student ss2 = (Student) ois.readObject() ;
		System.out.println(ss);
		System.out.println(ss1);
		System.out.println(ss2);
		ois.close();
		System.out.println("Done..!!!");
	}
}
