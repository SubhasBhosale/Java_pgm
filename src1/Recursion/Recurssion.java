package Recursion;

public class Recurssion {

	static int fib1=0;
	static int fib2=1;
	static int fib3;
	public static void test(int z)
	{
		if(z<=10)
		{
			fib3=fib1+fib2;
			System.out.print(" "+fib3);
			fib1=fib2;
			fib2=fib3;
			z++;
			test(z);
		}
	}
	public static void main(String[] args)
	{
			System.out.print(fib1+" "+fib2);
			test(1);
	}
}