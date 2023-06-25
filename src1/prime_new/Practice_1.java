package prime_new;

public class Practice_1 
{
	public static void main(String[] args) 
	{
		int[] a = {23,45,67,89,20,46,12,47,45};      //23 67 89 47 
		
		for (int i = 0; i < a.length; i++)
		{
			int no = a[i];
			int count=0;
			for (int j = 1; j <= no; j++) 
			{
				if (no%j==0) 
				{
				count++;	
				}
			}
			if (count==2)
			{
				System.out.print(no+" ");
			}
		}
	}
}
