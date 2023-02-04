package Core_Java;

import java.util.Scanner;

public class Laptop_Driver {
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Laptop company :");
	  String brand = sc.next();
	  System.out.println("Enter Laptop price :");
	  double price = sc.nextDouble();
	  System.out.println("Enter Laptop :");
	  String modelName =sc.next();
	  System.out.println("Enter Pen Drive company :");
	  String Brand = sc.next();
	  System.out.println("Enter Pen Drive memory :");
	  int memory = sc.nextInt();
	  System.out.println("Enter Pen Drive transfering speed :");
	  int speed = sc.nextInt();
	  
	  
	  Laptop L1= new Laptop(brand,price,modelName);
     
	  L1.printAttribute(new pen_Drive(Brand,memory,speed));
  }
}
