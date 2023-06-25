package fibonacci;

public class practice 
{
	public static void main(String[] args) 
	{
		int fib1=0;
		int fib2=1;
		System.out.print(fib1+" "+fib2+" ");

		for (int i = 0; i < 10; i++) 
		{
			int	fib3=fib2+fib1;
			fib1=fib2;  //first 2 empty 
			fib2=fib3;   // then store
		
			System.out.print(fib3+" ");
		}
	}
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55