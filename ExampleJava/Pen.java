package ExampleJava;

import java.util.Scanner;

class Pen {

	static String pen1 = "Pen";
	String color;
	double price;
	String brand;
	static int size = 50;

	Pen(String color, double price, String brand) {

		this.color = color;
		this.price = price;
		this.brand = brand;

	}

	static double d = 20;

	static {
		System.out.println(size);
		System.out.println(d);
	}
	

	public static void toWrite() {

		System.out.println("To write we use " + pen1);
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
        System.out.println();
		
		
		Pen pen = new Pen(color, price, brand);
		Pen.toWrite();
		System.out.println("color= "+pen.color +" Brand="+ pen.brand + " Price=" + pen.price);
  System.out.println(d);
	}

	static {
		System.out.println("Its is Good");
	}

}