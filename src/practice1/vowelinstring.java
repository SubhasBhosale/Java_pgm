package practice1;

public class vowelinstring 
{
	public static void test(int count)
	{
		int a=0;
		int b=1;
		int c=1;
		for (int i = 0; i <= count; i++)
		{
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
	public static void main(String[] args) 
	{
			test(12);

	}

}
