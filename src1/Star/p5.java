package Star;

public class p5 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			char c='A';
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}
/*

A 
A B 
A B C 
A B C D 
A B C D E 


*/