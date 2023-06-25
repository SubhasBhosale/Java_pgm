package prime_new;

public class practice 
{
	private static boolean isPrime(int no)
	{
		if (no<=1)
		{
			return false;
		}
		
		for (int i = 2; i < no; i++) 
		{
			if (no%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args)          //  23 67 89 47 
	{
		int[] arr = {23,45,67,89,20,46,12,47,45};
		for (int i = 0; i < arr.length; i++) 
		{
			if (isPrime(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}