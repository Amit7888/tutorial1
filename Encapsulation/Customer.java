package Encapsulation;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Bank bk=new Bank();
		
		int ch;
		boolean exit=true;
		while(exit){ 
		System.out.println("1.Deposite Money:");
		System.out.println("2.Withdraw Money:");
		System.out.println("3.Check Balance");
		
		
		System.out.println("\nEnter your choice:");
		Scanner sc =new Scanner(System.in);
		ch=sc.nextInt();
				
		switch(ch)
		{
		case 1: bk.Deposite(bk.money);
		break;
		case 2: bk.Withdraw(bk.money);
		break;
		case 3: bk.CheckBal();
		break;
		default:
		System.out.println("Invalid Choice");
		}
		}
	}

}
