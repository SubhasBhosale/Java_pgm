package Star;

public class p10 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 01; i <= n; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n; i <= n+n; i++) 
		{
			for (int k = 1; k <= n; k++)
			{
				System.out.print(" ");
			}
			for (int j = n; j <=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n+n; i <= n+n; i++) 
		{
			for (int k = 1; k <= 5; k++)
			{
				System.out.print(" ");
			}
			for (int j = 10; j <=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}