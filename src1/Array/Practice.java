package Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice 
{
	public static void main(String[] args) 
	{
		String[] a= {"root","subhas","james"};
		
		
		for (int i = 0; i < a.length; i++) 
		{
			String str = a[i];
			int count=0;
			for (int j = 0; j < str.length(); j++) 
			{
				if (str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u')
				{
					count++;
				}
			}
			System.out.println(str+" "+count);
			
		}
	}
}