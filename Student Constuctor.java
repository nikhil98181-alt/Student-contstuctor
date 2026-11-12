package Constructer;
import java.util.Scanner;

/**
 *
 * @author Nikhil Kumar
 */
public class Student {
    public int college_code;
    public String course_name;
    public double fee;
    Scanner s1 = new Scanner (System.in);
    
    public void get_data()
    {
        college_code=s1.nextInt();
        course_name=s1.nextLine();
        fee=s1.nextDouble();
    }
    
   
    public Student(int college_code , String course_name, double fee)
    {
        this.college_code= college_code;
        this.course_name= course_name;
        this.fee=fee;
    }
     public void displaystudent1()
    {
        System.out.println("college code = "+college_code);
        System.out.println("course name = "+course_name);
        System.out.println("fee = "+fee);
    }
}
public class Program2 {
    public static void main (String[]args)
    {
       
        Student s2 = new Student(101,"btech",25000);
        s2.displaystudent1();
       
    }
    
}

