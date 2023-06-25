package Interview;

public class CssCorp 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=100; i++) 
		{
			int temp=i;
			int	z=i%10;
			int c=i/10;
			if (z==c)
			{
				System.out.print(temp+" ");	
			}
		}
	}
}








//int a=11;
//int t=a%10;
//int c=a/10;
//System.out.println("c =>"+c);
//System.out.println("t =>"+t);
//
//System.out.println(c==t);
//if (c==t)
//{
//	System.out.println(a);
//}