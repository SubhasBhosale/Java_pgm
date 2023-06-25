package Star;

public class p3__
{
	public static void main(String[] args) 
	{
		for (int i = 5; i >= 1; i--) 
		{
			int a=5;
			for (int j = 5; j >= i; j--) 
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}
}
/*

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 


*/