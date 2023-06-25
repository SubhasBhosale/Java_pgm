package prime_new;
import java.util.Iterator;
public class PrimeFrom0to20 
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
	public static void getPrimeno(int no)
	{
		for (int i = 2; i <= no ; i++)
		{
			if (isPrimeno(i))
			{
				System.out.print(i+" ");
			}	
		}
		
	}
	public static void main(String[] args) 
	{
		getPrimeno(20);
	}
}
//2 3 5 7 11 13 17 19 