package Core_Java;
	 public class Cars extends Car
	  {
		  public void noOfTyres()
		  {
			  System.out.println("4 Tyres");
		  }
		  public void color()
		  {
			  System.out.println("Black");
	      }
		  public void noOfSeats()
		  {
			  System.out.println("6 Seater");
		  }
		  
		  public static void main (String[]args)
		  {
			 Cars c1 =new Cars ();
			  c1.noOfTyres();
			  c1.color();
			  c1.noOfSeats();
		  }
	  }



