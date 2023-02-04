package Core_Java;

import java.util.Scanner;

public class BagDriver {

	

	public static void main(String[] args) {
          
		
		Scanner sc = new Scanner(System.in);
		Bag b1 = new Bag();
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your Choice \n1.Add Ball \n2.Remove Ball \n3.check Bag \n4.Show Bag \n");
			int choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
			{
				System.out.println("Which Ball?? \n1.Tennis Ball \n2.Basket Ball");
				choice =sc.nextInt();
				switch(choice)
				{
				case 1:
				{
					System.out.println("Enter the Radius of Tennis Ball");
					double radius = sc.nextDouble();
					b1.addBall(choice,radius);	
				}
				break;
				
			case 2:
			{
				System.out.println("Enter the Radius of Basket Ball");
				double radius = sc.nextDouble();
				b1.addBall(choice,radius);	
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
				System.out.println("--------------------------");
			}
			}
			}
			break;
			case 2:
			{
				b1.removeBall();
			}
			break;
			case 3:
			{
				b1.checkBag();
				
			}
			break;
			case 4:
			{
				b1.showGame();
			}
			}
		}
	}

}
