package Primeno;

public class Practice 
{

	public static boolean isPrime(int n)
	{
		if (n<2)
		{
//			System.out.println("not a prime no");
			return false;
		}

		for (int i = 2; i < n; i++) 
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) 
	{
		System.out.println(isPrime(5));
		System.out.println(isPrime(4));
		for (int i = 0; i < 20; i++)
		{
			if (isPrime(i)==true)
			{
				System.out.println(i);	
			}
		}
	}

}