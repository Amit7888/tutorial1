package ArrayList;

import java.util.Scanner;

public class Driver_Bank {
	 public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Account_Bank B1 =new Account_Bank();
		boolean exit = true;
		while(exit) {
		System.out.println("Enter Your Choice :\n 1.Add Account \n 2.remove Account \n 3.Update Account \n 4.Display Account Details \n"
				+ " 5.Withdraw \n 6.check Balance  \n 7.Deposit Cash/Money  \n 8.change password \n 9.Exit ");
		int Choice =sc.nextInt();
		
		switch(Choice) {
		
		case 1:
		{
			B1.addAccount();
		}
		break;
		case 2 :
		{
			B1.removeAccount();
		}
		break;
		case 3 :
		{
			B1.updateAccount();
		}
		break;
		case 4 :
		{
			B1.displayAccount();
		}
		break;
		case 5 :
		{
			B1.withdraw();
		}
		break;
		case 6 :
		{
			B1.checkBal();
		}
		break;
		case 7 :
		{
			B1.deposite();
		}
		break;
		case 8 :
		{
			B1.changePass();
		}
		break;
		case 9:
		{
			exit=false;
			System.out.println("Youa are out now ");
		}
		break;
		default :
		{
			System.out.println("-------------------------------invalid Option-------------------------");
		}
		}

	}
  }
} 