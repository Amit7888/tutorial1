package Pattern;

public class pt6 {

	public static void main(String[] args) {
		int line =5;
		int star =5;
		int space=line-1;
		
		for(int i=1;i<=line;i++)
		{   
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
