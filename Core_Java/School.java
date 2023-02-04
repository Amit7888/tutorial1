package Core_Java;
import java.util.*;

public class School {
       String sname;
       
       Student s;
       School(String sname){
    	   this.sname=sname;
       }
       public void addStudent(Student s) {
    	   
    	   if(this.s==null) {
    		   this.s=s;
    		   System.out.println("Addmition taken Succefully...");
    	   }
    	   else {
    		   System.out.println("Student already present...");
    	   }
       }
       public void cancelAdmission()
       {
    	   if(this.s==null) {
    		   System.out.println("First take Admission..");
    	   }
    	   else {
    		   this.s=null;
    		   System.out.println("Admission canelled succefully...");
    	   }
       }
       public void updateStudent() {
    	   if(this.s==null) {
    		   System.out.println("First take Admission...");
    	   }
    	   else {
    		   Scanner sc =new Scanner(System.in);
    		   System.out.println("Enter the id to update..");
    		   int id=sc.nextInt();
    		   this.s.id=id;
    		   System.out.println("Enter the std to update");
    		   int std = sc.nextInt();
    		   this.s.std=std;
    		   System.out.println("Details update succefully...");
    	   }
       }
       public void displayStudentDetails() {
    	   if(this.s==null) {
    		   System.out.println("First take Admission..");
    	   }
    	   else {
    		   System.out.println("-----"+sname+"----");
    		   System.out.println("Student id:"+s.id);
    		   System.out.println("Student name :" +s.name);
    		   System.out.println("Student std :"+ s.std);
    	   }
    	   
    	   
       }
}
