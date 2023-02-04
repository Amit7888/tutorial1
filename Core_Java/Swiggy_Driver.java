package Core_Java;

import java.util.Scanner;

public class Swiggy_Driver {

		public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		Swiggy s1=new Swiggy("SWIGGY");
		boolean exit =true;
		while(exit) 
		{
			System.out.println("Enter the choice \n1.Customer Details\n2.Cancel Order \n3.update customer details \n4.display Order Details");
		  int choice = sc.nextInt();
		  switch(choice) {
		  case 1:
		  {
			  System.out.println("Enter the Customer Name");
			 String name=sc.next();
			  System.out.println("Enter the Customer address ");
			  String address = sc.next();
			  System.out.println("Enter the Contact Number");
			  long contactNum= sc.nextLong();
			  System.out.println("Enter the Product Name");
			  String product = sc.next();
			  
			  s1.placeOrder(new Customer(name,address,contactNum,product));
		  }
		  break;
		  case 2:
		  {
			  s1.cancelOrder();
		  }
		  break;
		  case 3:
		  {
			  s1.updateOrder();
		  }
		  break;
		  case 4:
		  {
			  s1.displayOrder();
		  }
		  break;
		  
		  default:{
			  System.out.println("Invalid Option");
		  }
		  break;
		  }
		}
	}

}
