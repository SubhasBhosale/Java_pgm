package practice1;

public class p_swapwithoutusingVar 
{
	public static void main(String[] args) 
	{
		int a=10;   int b=5;
		System.out.println("before a ==>> "+a);
		System.out.println("before b ==>> "+b);

		System.out.println();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after a ==>> "+a);
		System.out.println("after b ==>> "+b);
	}

}
