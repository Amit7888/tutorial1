package Core_Java;

import java.util.Scanner;

public class Swiggy {
       String hname;       
	Customer c;
	   
	Swiggy(String hname){
		this.hname=hname;
	       }
	    public void placeOrder(Customer c) {
	    	   
	    	   if(this.c==null) {
	    		   this.c=c;
	    		   System.out.println("Place the Order...");
	    	   }
	    	   else {
	    		   System.out.println("Order already placed...");
	    	   }
	       }
	       public void cancelOrder()
	       {
	    	   if(this.c==null) {
	    		   System.out.println("First book the Order...");
	    	   }
	    	   else {
	    		   this.c=null;
	    		   System.out.println("Order Cancel Succefully...");
	    	   }
	       }
	       public void updateOrder() {
	    	   if(this.c==null) {
	    		   System.out.println("First book the Order...");
	    	   }
	    	   else {
	    		   Scanner sc = new Scanner(System.in);
	    		   System.out.println("Update your address..");
	    		   String address=sc.next();
	    		   c.setAddress(address);
	    		   System.out.println(" update  your new-customer number...");
	    		   long contactNum =sc.nextLong();
	    		   c.setContactNum(contactNum);
	    		   System.out.println(" Enter product name...");
	    		   String product =sc.next();
	    		   c.setProduct(product);
	    	   }
	       }
	       public void displayOrder() {
	    	   if(this.c==null) {
	    		   System.out.println("First book the Order...");
	    	   }
	    	   else {
	    		   System.out.println(hname);
	    		    System.out.println("Customer Name :" + c.getName());
	    		    System.out.println("Customer Address :"+ c.getAddress());
	    		    System.out.println("Customer Number :"+ c.getContactNum());
	    		    System.out.println("Customer Product Name :" + c.getProduct());
	    	   }
	    	
	}   
}
