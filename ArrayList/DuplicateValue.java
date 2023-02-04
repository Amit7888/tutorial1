package ArrayList;

public class DuplicateValue {

	public static void main(String[] args) {
//     
//		int []a= {3,5,3,4,2,2,1};
//		System.out.println("Duplicate Values are :");
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if((a[i]==a[j])&&(i!=j))
//				{
//					System.out.println(a[j]+",");
//				}
//			}
//		}
		
		int[]a= {1,5,2,3,2,5,4};
		System.out.println("Duplicate values are :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println(a[j]+",");
				}
			}
		}
	}

}
