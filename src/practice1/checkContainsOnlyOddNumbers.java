package practice1;

public class checkContainsOnlyOddNumbers 
{
	public static void main(String[] args)
	{
		int[] a= {2,4,8,6,7,8,6,4,2};
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==1)
			{
				System.out.println("integer array cantains odd no => "+a[i]);
				break;

			}
		}
	}}
