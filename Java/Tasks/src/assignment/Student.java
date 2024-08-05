package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Student {
    private int rollno,sum, m1, m2, m3;
    private float per;
    private String name;
    private static int total,no=1100;
    

    private static DecimalFormat change = new DecimalFormat("0.00");
	

    public Student(String name, int a, int b, int c) {
        this.name = name;
        rollno= ++no;
        m1 = a;
        m2 = b;
        m3 = c;
        stu_sum();
        percentage();
        total+=(m1+m2+m3);
    }

    private void percentage() {
        per = (float) (m1 + m2 + m3) / 3;
    }

    private void stu_sum() {
        sum = m1 + m2 + m3;
    }

    public void display() {
        System.out.println("Roll no   : "+rollno+
        		"\nName      : " + name +
                "\nMarks     : " + m1 + "  " + m2 + "  " + m3 +
                "\nSum       : " + sum +
                "\nPercentage: " + change.format(per) + "%\n");
    }

//    public void total() {
//        total += (m1+m2+m3);
//    }

    public static int get_total() {
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. student: ");
        int size = sc.nextInt();
        
        Student s[] = new Student[size];

        for (int i=0; i<s.length; i++) {
            System.out.print("Name   : ");
            String nam = sc.next();
            System.out.print("English: ");
            int x = sc.nextInt();
            System.out.print("Maths  : ");
            int y = sc.nextInt();
            System.out.print("Science: ");
            int z = sc.nextInt();
            
            s[i] = new Student(nam, x, y, z);
            
        }
        //for(int i: s) {
//        for (int i = 0; i < s.length; i++) {
//           s[i].total();
//        }
        
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }

        System.out.println("\nSum of all Student marks: " + get_total());
    }
}
