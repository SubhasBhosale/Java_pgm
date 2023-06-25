package prime_new;

public class PrimeNO 
{
	
	public static boolean isPrimeno(int n)
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
	
	public static void main(String[] args) 
	{
		System.out.println("-1 prime no : "+isPrimeno(-1));
		System.out.println("0 prime no : "+isPrimeno(0));
		System.out.println("2 prime no : "+isPrimeno(2));
		System.out.println("20 prime no : "+isPrimeno(20));
	}
}
