package Encapsulation;

import java.util.Scanner;

public class Bank {
	
	private double bal=10000;
	private int pwd;
    double money;
	public void Deposite(double money)
	{
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		pwd=sc.nextInt();
		if(pwd==123)
		{
			System.out.println("Deposite Money:");
			Scanner s =new Scanner(System.in);
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Deposited Money "+money);
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	
	public void Withdraw(double money)
	{
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		pwd=sc.nextInt();
		if(pwd==123) {
			System.out.println("Withdraw Money:");
			Scanner s =new Scanner(System.in);
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("Withdraw Money :"+money);
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	public void CheckBal()
	{
		System.out.println("Enter Password");
		Scanner sc =new Scanner(System.in);
		pwd=sc.nextInt();
		if(pwd==123)
		{
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}

}
