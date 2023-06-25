package string;

import java.util.LinkedHashSet;

public class String_array_remove_duplicate_character 
{
	public static void main(String[] args) 
	{
		String[] a= {"abcc","abbcd","abbbddvvvddeeee"};
		String[] b=new String[a.length];
		
		LinkedHashSet<Character> set = new	LinkedHashSet<Character>();
		for (int i = 0; i < a.length; i++)
		{
			String str = a[i];
			for (int j = 0; j < str.length(); j++) 
			{
				set.add(str.charAt(j));
			}
			System.out.println(set);
			set.clear();
		}
	}
}