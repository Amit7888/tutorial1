package Core_JavaP;

public class Bag_Driver {
	//Encapsulation
	
		public static void main (String[]args)
		{
			Bag b1 = new Bag();
			b1.getBrand();
			b1.getColor();
			b1.getPrice();
		    b1.setBrand("Amit");
		    b1.setColor("Black");
		    b1.setPrice(1000);
		    System.out.println(b1.getBrand());
		    System.out.println(b1.getColor());
		    System.out.println(b1.getPrice());
			
		}
	}

