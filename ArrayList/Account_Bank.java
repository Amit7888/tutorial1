package ArrayList;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Account_Bank {
      
	Account A;
	Scanner sc  = new Scanner (System.in);
	ArrayList<Account> a1 = new ArrayList<Account>();
	
	public void addAccount() {//done
		System.out.println("Enter Account Holder Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Account Holder Account Number : ");
        long accountnumber = sc.nextLong();
		System.out.println("Enter Account Holder City : ");
		sc.nextLine();
        String city = sc.nextLine();
		System.out.println("Enter Account ifsc code : ");
		sc.nextLine();
        String ifsc = sc.nextLine();
		System.out.println("Enter Account Holder Contact Number  : ");
		long customernumber = sc.nextLong();
		System.out.println("Enter Account Password : ");
        int password =sc.nextInt();
		System.out.println("Enter Account Balance : ");
        double accountbal =sc.nextDouble();
        
        A = new Account(name,accountnumber,city,ifsc,customernumber,password,accountbal );
         a1.add(A);
         System.out.println("Account Added Succesfullyy....");
	}
	
	
	public void removeAccount() {//done
		if(this.A==null) {// try this.A==null 
			System.out.println(" No Account Available Add first ...");
		}
		else {
			System.out.println("Enter Your Password ");
			int pass=sc.nextInt();
			if(pass==A.getPswrd()) {
			
			System.out.println(" Enter Account Number to remove : ");
			long acctoremove =sc.nextLong();
			for(Account a: a1) {
				if(acctoremove == A.getAcNo()) {
					
					a1.remove(A);
					System.out.println("Account will be removed");
					return;
				}
			}
			System.out.println("No Account Found ...");
			}
			else {
				System.out.println("wrong password enterd ");
			}
			
		}
	}
	
	
	
	public void updateAccount() {//done
		if(this.A==null) {// try this.A==null 
			System.out.println(" No Account Available Add first ...");
		}else {
			System.out.println("Enter Your Password ");
			int pass=sc.nextInt();
			if(pass==A.getPswrd()) {
			
			System.out.println(" Enter Account Number to update : ");
			long acctoupdate =sc.nextLong();
			for(Account a: a1) {
				if(acctoupdate == A.getAcNo()) {
					
					System.out.println("Enter City to update : ");
					sc.nextLine();
					String updatecity = sc.nextLine();
				    A.setCity(updatecity);
					
					System.out.println("Enter customer number to update : ");
					long updatenumber =sc.nextLong();
					A.setCuNo(updatenumber);
					System.out.println(" Your data will be updated successfully...");
					return;
	    			}
				}
			System.out.println("No Account Found ...");
			
			}else {
				System.out.println("Wrong Password Entered ");
			}
				}
	}
	
	
	public void displayAccount() {//done
		if(a1==null) {// try this.A==null 
			System.out.println(" No Account Available Add first ...");
		}else {
			System.out.println("Enter Your Password ");
			int pass=sc.nextInt();
			if(pass==A.getPswrd()) {
			
			System.out.println(" Enter Account Number to Display Data : ");
			long acctodisplay =sc.nextLong();
			for(Account a: a1) {
				if(acctodisplay == A.getAcNo()) {
					
					System.out.print(A);
					return;
					}
				}
			System.out.println("NO Account Found ...");
			}else {
				System.out.println("wrong Paassword entered ");
			}
			
		}
	}
	
	
	
	public void withdraw() {//done
		if(this.A==null) {
  		  System.out.println("You Dont Have Account Plz Open Account First : \n");
        	  		
  	  }else{
  		  
  		System.out.println("Enter Your Password ");
		int pass=sc.nextInt();
		if(pass==A.getPswrd()) {
		
  		System.out.println(" Enter Account Number to withdraw Money : ");
		long acctowithdraw =sc.nextLong();
		for(Account a: a1) {
			if(acctowithdraw == A.getAcNo()) {
				
				System.out.println(" Enter Amount TO Withdraw  : ");
      			double wamt = sc.nextDouble();
      		if(wamt>A.getAccBal()) {
      			System.out.println(" Your Funds Are Not Sufficient \n");
      			
      			}else {
      			
      				double bal = A.getAccBal()-wamt;
          			A.setAccBal(bal);                     // here some changes done
          			System.out.println("Your Account Will Be Debitted With Amount " + wamt +"\n");
          			
          			System.out.println("Your New Account Balance Will Be : " + A.getAccBal());
          			return;
      	            //System.out.println("");
      			}
      			}
			}
		System.out.println("NO Account Found ...");
		}
		else {
				System.out.println("You Entered Wrong Password  Plz Try Again....");
			}
	 }
}
	
	
	
	
	
	
	public void checkBal() {//done
		if(this.A==null) {
  		  System.out.println("You Dont Have Account Plz Open Account First : \n");
        	  		
  	  }else{
  		System.out.println("Enter Your Password ");
		int pass=sc.nextInt();
		if(pass==A.getPswrd()) {
		
		
  		System.out.println(" Enter Account Number to check balance : ");
		long acctocheckbalance =sc.nextLong();
		for(Account a: a1) {
			if(acctocheckbalance == A.getAcNo()) {
				System.out.println("Your Account Balance Is :"+ A.getAccBal());
				return;
    		}
			}
		System.out.println("NO Account Found ...");
		}
		else {
			System.out.println(" Wrong Password Entered...\n ");
		}
		
  	  }
		
	}
	
	
	
	
	
	public void deposite() {//done
		if(this.A==null) {
  		  System.out.println("You Dont Have Account Plz Open Account First : \n");
        	  		
  	  }else{
  		System.out.println(" Enter Account Number to deposit Money : ");
		long acctodeposit =sc.nextLong();
		for(Account a: a1) {
			if(acctodeposit == A.getAcNo()) {
				
				// password not asked because anyone can add amount into my account
				System.out.println(" Enter Amount TO Deposit : ");
      			double damt = sc.nextDouble();
      			
      		double depositbal =A.getAccBal()+ damt;
//      			A.setAccbal(depositbal);
      		A.setAccBal(depositbal);               // here also some changes done
      			System.out.println("Your Account Will Be Creditted With Amount " +damt +" \n");
      			System.out.println("Your New Account Balance Will Be : " + A.getAccBal());
      		return;
			}
			}
		System.out.println("NO Account Found ...");	
  		  
  	  }
	}
	
	
	
	
	
	
	
	
	
	
	public void changePass() {//done
		if(this.A==null) {
			System.out.println("You Dont Have Account Plz Open Account First :  \n");
		}else{
			System.out.println("Enter Your old Password ");
			int pass=sc.nextInt();
			if(pass==A.getPswrd()) {
			
			System.out.println("Enter Account number whoose password have to change : ");
			long acctochangepasswrd =sc.nextLong();
			for(Account a: a1) {
				if(acctochangepasswrd == A.getAcNo()) {
			
			
			 System.out.println("Enter Your New Password ");
			int newpass = sc.nextInt();
			A.setPswrd(newpass);
			System.out.println(" Your new Password Updated Succesfully...\n");
			return;
			}
			
			}
			System.out.println("NO Account Found ...");
			
			}else {
				System.out.println("Incorrect Password...\n");
			}
				}
	}
	
	
}
