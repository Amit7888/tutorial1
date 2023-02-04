
public class wideningNarrowing {

	public static void main(String[] args) {
	//  byte,short ,char - int - long-float-double  -----widening  smallest primitive into largest primitive data type
		 //  double-float-long-int--short ,byte,char  --- narrowing largest primitive data type into smallest
		    //widening examples
			System.out.println("widning examples");
		    byte a=10;
			int i= a;
			long l=a;
			float f=a;
			double d =a;
			System.out.println(a);
			System.out.println(i);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
		    //narrowing examples
			System.out.println("narrowing examples");
			double b=10.0;
			float c=(float)b;
			long e = (long)b;
			int g =(int)b;
			byte h =(byte)b;
			System.out.println(b);
			System.out.println(c);
			System.out.println(e);
			System.out.println(g);
			System.out.println(h);
			
	}

}
