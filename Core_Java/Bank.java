package Core_Java;

import java.util.Scanner;

public class Bank {
                  
	String bankName;
	Account a;
	
	public Bank(String bankName) {
		this.bankName=bankName;
	}
	
	public void createAccount(Account a) 
	{
		if(this.a==null) {
			this.a=a;
		   System.out.println("Account is Created... ");	
		}
		else
		{
		  System.out.println("Account is already created...");	
		}
	}
		
		public  void deleteAccount() 
		{
	    	   if(this.a==null) {
	    		   System.out.println("First create a Account...");
	    	   }
	    	   else {
	    		   this.a=null;
	    		   System.out.println("Delete Account Succefully...");
	    	   }
	}
		public void updateDetails() 
		{

	    	   if(this.a==null) {
	    		   System.out.println("First create a Account...");
	    	   }
	    	   else {
	    		   Scanner sc = new Scanner(System.in);
	    		   System.out.println("Enter the password..");
	    	       int passw =sc.nextInt();
	    	       if(passw==a.getPassw()) 
	    	       {
	    	    	   System.out.println("Enter the new Contact Number..");
	    	    	   long contNum = sc.nextLong();
	    	    	   a.setPassw(passw);
	    	    	   System.out.println("Enter the new City...");
	    	    	   String city=sc.next();
	    	    	   a.setCity(city);
	    	    	   System.out.println("Details update Sucessfully...");
	    	       }
	    	       else 
	    	       {
	    	    	System.out.println("Incorrect Password");   
	    	       }
	    	   }
	    	   }
		      public void displayDetails() 
		      {
		    	if(this.a==null) 
		    	{
		    	System.out.println("First Create Account..");	
		    	}
		    	else
		    	{  
		    		System.out.println(bankName);
		    		System.out.println("Customer Name" +a.getAnHolderName());
		    		System.out.println("Customer Account Number" +a.getAcNo());
		    		System.out.println("Bank IFSC Number"+a.getIfsc());
		    		System.out.println("Customer Contact Number"+a.getContNum());
		    		System.out.println("Customer City" +a.getCity());		    
		    		}
		      }
	     	}
	
	
	

