package interview_quetions;

import java.util.LinkedHashSet;

public class SONY_5 
{
	public static void main(String[] args)
	{
		String s="aabbaa";			//O/p => aa ab bb ba aa

		try
		{
			for (int i = 0; i < s.length()-1; i++)
			{
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i+1));
				System.out.print(" ");
			}
		}
		catch (Exception e) 
		{

		}
		
		
		System.out.println();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		System.out.print(set);
	}
}
