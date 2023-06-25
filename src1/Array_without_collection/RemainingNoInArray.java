package Array_without_collection;

import java.util.HashSet;

public class RemainingNoInArray 
{
	public static void main(String[] args) 
	{
		int[] a= {1,4,7,5};	
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			
			set.add(i);
		}
		
		for (int i = 1; i <= 10; i++) 
		{
			if(!set.contains(a[i]))
			{
				System.out.println(a[i]);
			}
		
		}
	System.out.println(set);
	}
}