
package assignment;

public class Person {
	private String name;
	private int age;
	
	public Person() {		
		age = 18;
	}
	public Person(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		this();
		this.name = name;		
	}
	public void display() {
		System.out.println("Name : "+name+"  Age: "+age);
	}
	public static void main(String[] args) {
		Person p = new Person();
	    Person p1 = new Person("Ajay");
	    Person p2 = new Person("Rahul",88);
	    p.display();
	    p1.display();
	    p2.display();
	}
}