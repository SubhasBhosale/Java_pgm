package interview_quetions;

import java.util.ArrayList;
import java.util.TreeSet;

public class SONY_7_Upper_Lower_ascii 
{
	public static void main(String[] args) 
	{
		String s = "dabDhgjB";
		TreeSet<Character> set = new TreeSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				set.add(s.charAt(i));
			}
		}
		System.out.println(set.first());
	}
}
