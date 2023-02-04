package Core_Java;

import java.util.Scanner;

public class Books_Driver {
	public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in); {
			 System.out.println("Enter Your Size Array ");
			  int size = sc.nextInt();
			 Books [] Bookarray = new Books [size];
			  
			  for (int i=0;i<size;i++) {
				  System.out.println("Enter your book name :");
				  String bookname = sc.next();
				  System.out.println("Enter your book id :");
				  int bookid = sc.nextInt();
				  Bookarray [i] = new Books (bookname,bookid);
			  }
			 System.out.println();
			 System.out.println();
			 System.out.println();
			 
			 
		   }

	}

}
