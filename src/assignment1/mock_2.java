package assignment1;

import java.util.LinkedHashSet;

public class mock_2 
{
	public static void main(String[] args) 
	{
		int[] a= {1,4,6,8}; 
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for (int j = 1; j <=10; j++) 
		{
			if(!(set.contains(j)))
			{
				System.out.println(j);
			}
		}
	}
}
