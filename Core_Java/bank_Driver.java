package Core_Java;

import java.util.Scanner;

public class bank_Driver {

	public static void main(String[] args) 
	{
		        Scanner sc=new Scanner(System.in);
		        Bank b1 = new Bank("SBI");
		        boolean exit=true;
		        while(exit)
		        {
		        	System.out.println("Enter the choice \n1.Create Account \n2.Delete Account Details \n3.Update Account details \n4.Dispaly Account Details");
		        	int choice=sc.nextInt();
		        	switch(choice)
		        	{
		        	case 1:
		        	{
		        		
		        		System.out.println("Enter Account Holder Name :");
		        		String anHolderName =sc.next();		        
		        		System.out.println("Enter Account Number :");
		        	    long acNo=sc.nextLong();
		        		System.out.println("Enter the IFSC Number");
		        	    String ifsc  =sc.next();
		        		System.out.println("Enter City :");
		        	    String city  =sc.next();
		        	    System.out.println("Enter your Contact Number");
		        	    long   contNum=sc.nextLong();
		        	    System.out.println("Enter your Password");
		        	    int passw = sc.nextInt();
		        	    
		        	    b1.createAccount(new Account(anHolderName,acNo,ifsc,contNum,city,passw));
		        	
		        	}
		        	break;
		        	case 2:
		        	{
		        		b1.deleteAccount();
		        	}
		        	break;
		        	case 3:
		        	{
		        		b1.updateDetails();
		        	}
		        	break;
		        	case 4:
		        	{
		        		b1.displayDetails();
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
