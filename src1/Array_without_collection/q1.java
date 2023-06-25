package Array_without_collection;

import java.util.Iterator;

public class q1 
{
	public static void main(String[] args) 
	{
		int[] a= {1,1,5,2,6,4,2,2};
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]==a[j])
				{
					if (j<i) 
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if (count>=1)
			{
				System.out.println(a[i]+" "+count);
			}
		}
	}
}
