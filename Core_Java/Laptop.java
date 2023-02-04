package Core_Java;

public class Laptop {
	
	String brand;
	double price;
	String modelName;
	
	pen_Drive p ;
	Laptop (String brand ,double price,String modelName)
	{
		this.brand=brand;
		this.price=price;
		this.modelName= modelName;
		}
	
	public void printAttribute(pen_Drive p)
	{
		this.p=p;
		System.out.println("Laptop Company :" +brand);
		System.out.println("Laptop Price :" +price);
		System.out.println("Laptop modelName :" +modelName);
		System.out.println("Pen Drive Company :" +p.Brand);
		System.out.println("Pen Drive Memory :" +p.memory);
		System.out.println("Pen Drive Speed in Number :"+p.speed);
	}
	}


