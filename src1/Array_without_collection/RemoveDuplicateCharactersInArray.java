package Array_without_collection;

public class RemoveDuplicateCharactersInArray
{
	public static void main(String[] args)
	{
		int[] a = {0,7,8,9,8,10,10,2,6,9,1};
		
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]==a[j]) 
				{
					a[i]=123;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]!=123)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}

// 0 7 8 9 10 2 6 1 
// 0 7 8 10 2 6 9 1 