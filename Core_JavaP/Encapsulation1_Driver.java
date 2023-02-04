package Core_JavaP;

import java.util.Scanner;

public class Encapsulation1_Driver {

	public static void main(String[] args) {
	     Scanner sc = new Scanner (System.in);
		Encapsulation1 E1 = new Encapsulation1();
		  E1.getName();
		  E1.getModelName();
		  E1.getPrice();
		  E1.getScreenSize();
		/*  E1.setName("ASUS");
		  E1.setModelName("VivoBook");
		  E1.setPrice(55000);
		  E1.setScreenSize(15.6);
		  System.out.println(E1.getName());
		  System.out.println(E1.getModelName());
		  System.out.println(E1.getPrice());
		  System.out.println(E1.getScreenSize());*/
		/*  System.out.println("Enter your Laptop Company Name :");
		  String name = sc.next();
		  E1.setName(name);
		  System.out.println("Enter Your Laptop Model Name :");
		  String modelName = sc.next();
		  E1.setModelName(modelName);
		  System.out.println("Enter Your Laptop Price :");
		  double price = sc.nextDouble();
		  E1.setPrice(price);
		  System.out.println("Enter Your Laptop Screen Size :");
		  double screenSize = sc.nextDouble();
		  E1.setScreenSize(screenSize);*/
		  
		  System.out.println("Laptop Name :" +E1.getName());
		  System.out.println("Laptop Model Name :" + E1.getModelName());
		  System.out.println("Laptop Price :" +E1.getPrice());
		  System.out.println("Laptop Screen Size :" +E1.getScreenSize());
		  
		  System.out.println("Enter Your Laptop Company Name :");
		  String name = sc.next();
		  E1.setName(name);
		  System.out.println("Enter Your Laptop Model Name :");
		  String modelName = sc.next();
		  E1.setModelName(modelName);
		  System.out.println("Enter Your Laptop Price :");
		  double price = sc.nextDouble();
		  E1.setPrice(price);
		  System.out.println("Enter Your Laptop Screen Size :");
		  double screenSize =sc.nextDouble();
		  E1.setScreenSize(screenSize);
		  
		  System.out.println("-------------------");
		  System.out.println("Laptop Name :" +E1.getName());
		  System.out.println("Laptop Company Name :" + E1.getModelName());
		  System.out.println("Laptop Price :" +E1.getPrice());
		  System.out.println("Laptop Screen Size :" +E1.getScreenSize());
		  System.out.println("All The Your Laptop Details");
	}

}
