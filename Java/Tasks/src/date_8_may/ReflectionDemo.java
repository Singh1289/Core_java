package date_8_may;

import java.lang.reflect.*;

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException  {
		Class cls = Class.forName("assignment.Employee");
		System.out.println("Class :"+ cls.getName());
		
		Class supercls = cls.getSuperclass();
		System.out.println("Super :"+supercls);
		
		System.out.println("Constructor...");
		Constructor cons[] =  cls.getConstructors();
		for(int i=0;i< cons.length; i++)
			System.out.println(cons[i]);
		
		System.out.println("Method...");
		Method met[] = cls.getMethods();
		for(int i=0;i< met.length; i++)
			System.out.println(met[i]);
		
		System.out.println("Field...");
		Field fi[] = cls.getFields();
		for(int i=0;i< fi.length; i++)
			System.out.println(fi[i]);
		
	}
}
