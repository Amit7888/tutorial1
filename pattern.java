
public class pattern {

	public static void main(String[] args) {
         
		int line = 5;
		int star = 5;
		int space=line-1;
		
		for(int i=line;i>=1;i--) {
			int num=5;
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			
			{
				if(i%2==1)
				{
					System.out.print(num--);
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
			star--;
			space++;
		}
		
	}

}
