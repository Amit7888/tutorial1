
public class practice {

	public static void main (String [] args)
	{
		int line=5;
		int star=5;
		
		
		for(int i=1;i<=line;i++)
		{  
			int num=4;
			for(int j=1;j<=star;j++)
			{
				if(i%2==1)
				{
                 System.out.print("* ");
				}
				else
				{
					System.out.print(num-- +" ");
				}
			}
			System.out.println();
			star--;
		}
	}
	
	
}
