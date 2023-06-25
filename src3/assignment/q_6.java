package assignment;

import java.util.LinkedHashSet;

public class q_6 {

	public static void main(String[] args) 
	{
		String a = "aweexxxyyyyyy";
		char[] b = a.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < b.length; i++) 
		{
			set.add(b[i]);
		}
		for (Character s : set) 
		{
			int count=0;
			for (int j = 0; j < b.length; j++) 
			{
				if (s==b[j])
				{
					count++;	
				}
			}
			System.out.println(s+" is repeating for "+count+" times");
		}
	}

}
