package prime_new;

public class Primeno_alternative 
{
	public static boolean isPrime(int n)
	{
		if (n<=1)
		{
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
	
	public static void getPrimeNo(int no)
	{
		for (int i = 2; i <= no ; i++) {
			if (isPrime(i))
			{
				System.out.print(i+" ");
			}	
		}
	}
	public static void main(String[] args) 
	{
				getPrimeNo(20);
		
	}
}