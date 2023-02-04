
package Core_Java;
import java.util.*;

public class SchoolDriver {
	
	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	School s1=new School("Swami Ramanand vidyalaya");
	boolean exit =true;
	while(exit) 
	{
		System.out.println("Enter the choice \n1.Take Admission \n2.cancel Admission \n3.update Student  details \n4.display Student Details");
	  int choice = sc.nextInt();
	  switch(choice) {
	  case 1:
	  {
		  System.out.println("Enter the student id");
		  int id=sc.nextInt();
		  System.out.println("Enter the student name ");
		  String name = sc.next();
		  System.out.println("Enter the Student std");
		  int std=sc.nextInt();
		  
		  s1.addStudent(new Student(id,name,std));
	  }
	  break;
	  case 2:
	  {
		  s1.cancelAdmission();
	  }
	  break;
	  case 3:
	  {
		  s1.updateStudent();
	  }
	  break;
	  
	  case 4:
	  {
		  s1.displayStudentDetails();
	  }
	  break;
	  
	  default:{
		  System.out.println("Invalid Option");
	  }
	  break;
	  }
	}

	}}
