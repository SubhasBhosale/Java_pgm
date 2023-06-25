package Star;

public class p7 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <= 5; i++) 
		{
			char c='A';
			char d='U';
			for (int j = 0; j <= i; j++) 
			{
				
				if (i==5)
				{
					System.out.print(d+" ");
					d++;
				}
				else
				{
					System.out.print(c+" ");
					c++;
				}
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
U V W X Y Z 
zz

*/