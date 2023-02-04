
public class patternnumstar {

	public static void main(String[] args) {
		
	int line = 5;
	int star = 1;
	int space = line-1;
	
	for (int i=1;i<=line;i++) 
	{
		int num=6-i;
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print(num++);
			
		}
		System.out.println();
		space--;
		star++;
	}
	}
}
