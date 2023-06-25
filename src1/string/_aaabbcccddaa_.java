package string;

import java.util.LinkedHashSet;

public class _aaabbcccddaa_
{

	public static void main(String[] args) {
		String a="aaabbcccaa";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++) 
		{
			set.add(a.charAt(i));
		}
		//System.out.println(set);
		int count1=0;
		for (Character s : set)
		{
			int count=0;
			for (int i = 0; i < a.length(); i=i+count1)
			{
				if (s==a.charAt(i))
				{
					count++;
					count1++;
				}
			}
			System.out.println(s+" "+count);
		}
	}
}