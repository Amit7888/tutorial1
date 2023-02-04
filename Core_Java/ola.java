package Core_Java;

import java.util.Scanner;

public class ola {
	Cab c;
	public void boookCab(Cab c) {
		if (this.c==null)
		{
			this.c=c;
			System.out.println(" Cab is booked...");
			}
		else
		{
			System.out.println(" Cab is already booked...");
		}
		}
	public void cancelCab() 
	{
		if(this.c==null) {
			System.out.println(" First book the cab...");
		}
		else
		{
			this.c=null;
			System.out.println(" Cab is cancelled...");
		}
	}
	public void updateCab()
	{
		if(this.c==null) 
		{
			System.out.println(" First book the cab...");
		}
		else
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the new destination");
		    String destination = sc.next();
		    c.setDestination(destination);
			
		
			
			
		}
	}

}
