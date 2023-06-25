package pattern_practice;
public class pattern10 
{
	public static void main(String[] args) 
	{
		/*for (int i = 5; i > 0; i--)
		{
			for (int j = 5; j >= i; j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}*/
		
		
		for (int i = 1; i < 6; i++)
		{
			int a=5;
			for (int j = 1; j <= i; j++)
			{
				System.out.print(a--+" ");
			}
			System.out.println();
		}
	}
}
//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1 