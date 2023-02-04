package Pattern;

public class pt2 {

	public static void main(String[] args) {
     
		int line  = 5;
		int star = 5;
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(i==1||j==1||i==5||j==5)
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
