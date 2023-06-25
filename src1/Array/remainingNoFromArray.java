package Array;

import java.util.LinkedHashSet;

public class remainingNoFromArray {

	public static void main(String[] args)
	{
		int[] a= {2,5,7,9};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		//by applying collection concept time complexity will be reduced
		for (int i = 1; i <= 10; i++) 
		{
			set.add(i);
		}
		
		for (int i = 0; i < a.length; i++)
		{
			set.remove(a[i]);
		}
		System.out.println(set);	
		
	/*
	 *  time complexity is more bcz 2 for loops comparing each other 
	 * for below method
		for (int i = 1; i <= 10; i++)
		{
			boolean flag = true;
			for (int j = 0; j < a.length; j++) 
			{
				if(i==a[j])
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				System.out.print(i+" ");
			}
		}
		*/
	}}
