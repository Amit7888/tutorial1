package ExampleJava;

import java.util.ArrayList;

public class ArrayListP {

	public static void main(String[] args) {
		
		
//		ArrayList<String> name=new ArrayList<String>();
//		name.add("Amit");    //pre defined method in arraylist is add method
//		name.add ("Ankita");
//		name.add("Sister");
//		
//		System.out.println(name); 
//		name.add(2,"Amit.." );
//		name.set(2, "Shinde");
//		name.remove(3);  //single unite remove
//		
//		System.out.println(name); 
//		System.out.println(name.get(1));
//		name.clear();  //clear all element;
//		System.out.println(name); 
		
		
		ArrayList<String> name =new ArrayList<String>();
		name.add("Amit");     //add the element in arraylist
		name.add("jitendra");
		name.add("Shinde");
		System.out.println(name);
		name.add(3,"father");
		System.out.println(name);
		name.set(3, "PAPA");
		System.out.println(name);
		name.remove(3);  //remove use for remove only one element 
		System.out.println(name);
		
		//get or fetch only one element we use
		System.out.println(name.get(0));
		for(String str:name)
		{
			System.out.println(name);
		}
		name.clear(); // clear use for remove all data in array
		System.out.println(name);
}

}
