
public class onezeropattern {

	public static void main(String[] args)
	{	
		int line =5;
		int star = 1;
		int space =line-1;
		
		for(int i=1;i<=line-1;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++)
			{
				if(i==j|j==1)
				{
					System.out.print("* ");
				}
				// System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;	
		}
		for(int i=1;i<=line;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
			
		}
		
	}

}
