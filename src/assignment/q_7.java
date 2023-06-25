package assignment;

import java.util.LinkedHashSet;

public class q_7 {

	public static void main(String[] args) 
	{
		String c="Malayalam";
		String b = c.toLowerCase();
		char[] a = b.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
		}
		for (Character s : set)
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(s==a[j])
				{
					count++;
				}
			}
			System.out.print(s+":"+count);
		}
	}

}
