package Core_Java;

/* public  class Bike extends Vehicle  {
	  public void noOfWheels() 
	  {
		  System.out.println("2 Wheels");
	  }
	  public void noOfSeats() 
	  {
		System.out.println("2 Seats");  
	  }
     public static void main(String[]args)
     {
    	 
    	 
    	 Bike b1 =new Bike();
    	 b1.noOfSeats();
       b1.noOfWheels();	
	}
}*/

public class Bike extends Vehicle {
	public void noOfWheels()
	{
		System.out.println("2 wheels");
	}
	public  void noOfSeats()
	{
		System.out.println("2 Seats");
	}
	
	public static void main (String []args)
	{
		Bike s1 = new Bike();
		s1.noOfWheels();
		s1.noOfSeats();
	}
}
