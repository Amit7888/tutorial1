package Pattern;

public class pt3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int line =5;
		int star =5;
		
		for(int i=1;i<=line;i++)
		{   
			for(int j=1;j<=star;j++)
			{
				if(i==5||i==j||j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
