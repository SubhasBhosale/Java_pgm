package interview_quetions;

import java.util.LinkedHashSet;

public class SONY_firstNonDuplicateChar {
public static void main(String[] args) {
	String s="aabbcdef";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++)
	{
		set.add(s.charAt(i));
	}
	for (Character b : set)
	{
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (b==s.charAt(i))
			{
				count++;
			}
		}
		if (count==1)
		{
			System.out.println(b+" "+count);
			break;
		}
//		System.out.println(b+" "+count);
	}
}
}
