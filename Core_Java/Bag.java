package Core_Java;

public class Bag {
	
	Ball b;
	public void addBall(int choice,double radius)
	{
		if(this.b==null) 
		{
			if(choice==1) 
			{
				b=new TennisBall(radius);
				System.out.println("Tennis ball is Succefully Added");
                System.out.println("-------------");
			}
			else if(choice==2)
			{
				b=new BasketBall(radius);
				System.out.println("basket ball is Succefully Added");
				System.out.println("-------------");
			}
			else 
			{
				System.out.println("Invalid Choice");
			}
		}
		else
		{
			System.out.println("Ball is already Added");
		}
	}
	public void removeBall() 
	{
		if(this.b==null)
		{
			System.out.println("You have not Added any ball in bag");
			System.out.println("-------------");

		}
		else 
		{
			this.b=null;
			System.out.println("Ball is removed Succefully");
			System.out.println("-------------");	
		}
	}
	public void checkBag() 
	{
		if(this.b==null)
		{
			System.out.println("Bag is empty");
			System.out.println("-------------");

		}
		else 
		{
			System.out.println("Bag is not empty");
			System.out.println("-------------");	
		}
	}
	public void showGame() 
	{
		if(this.b==null)
		{
			System.out.println("Ball is not added in the Bag");
			System.out.println("-------------");

		}
		else 
		{    
			if(b instanceof TennisBall) 
			{
				TennisBall t1=(TennisBall)b;
			System.out.println("you can Play :"+t1.getGame());	
		}
			else
			{
				BasketBall b1 =(BasketBall)b;
				System.out.println("You can Play :"+b1.getGame());
			}
	}
	}}
