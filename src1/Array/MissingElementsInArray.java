package Array;

import java.util.HashSet;

public class MissingElementsInArray
{
	public static void main(String[] args) 
	{
		int[] a= {1,4,7,5};

		HashSet<Object> list = new HashSet<Object>();
		for (int i = 0; i < a.length; i++) 
		{
			list.add(a[i]);             //set=1 4 7 5
		}
		for (int i = 1; i < 10; i++)
		{
			if (list.add(i)==true)
			{
				System.out.println(i);
			}
		}
	}
}