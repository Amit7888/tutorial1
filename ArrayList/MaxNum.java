package ArrayList;

public class MaxNum {

//	public static void main(String[] args) {
//    
////		int[] a= {5,10,4,12,7,10};
////		int max =a[0];
////		for(int i=1;i<a.length;i++)
////		{
////			if(max<a[i])  // for min num only change >    min>a[i]
////			{
////				max=a[i];
////			}
////		}
////		System.out.println("" +max);
//		
//      // Min number program
//		
//		int[] a= {5,10,4,12,7,10};
//		int min = a[0];
//		for(int i=1;i<a.length;i++) {
//			if(min>a[i])
//			{
//				min=a[i];
//			}
//		}
//			System.out.println("" +min);
//	}
      // min program practice
	public static void main(String[]args) {
		
		int[] a= {10,5,2,6,7,15};
		int min =a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
	
	
	//max program practice
	
		int []b= {10,1,5,11,15,7,9};
		int max=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(max<b[i]) {
				max=b[i];
			}
		}
		System.out.println("" +" Max value is "+max );
		System.out.println("     AND");
		System.out.println("" +" Min value is "+min );
		}
	}
