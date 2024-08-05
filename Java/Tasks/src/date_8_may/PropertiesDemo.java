package date_8_may;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\Infoway\\Java\\abc.txt");
		p.load(fis);

		String s = p.getProperty("user");
		System.out.println(s);
//		 int x=0;
//		 while((x=fis.read())!= -1) {
//			 System.out.print((char)x);
//		 }
		
		File f = new File("D:\\Infoway\\Java\\abc.txt");
		
		if (f.isDirectory())
			System.out.println("Blank File");
		else
			System.out.println("False");
		
		
		System.out.println("1 : "+f.canRead());
		System.out.println("2 : "+f.canWrite());
		System.out.println("3 : "+f.isFile());
		System.out.println("4 : "+f.length());
		System.out.println("5 : "+f.mkdir());
		System.out.println("6 : "+f.getAbsolutePath());
		System.out.println("7 : "+f.getPath());
		System.out.println("8 : "+f.getCanonicalPath());
		System.out.println("9 : "+f.getParent());
		System.out.println("10 : "+f.getTotalSpace());
		
		fis.close();
		 
	}
}
