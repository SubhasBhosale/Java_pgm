package interview_quetions;

import java.util.LinkedHashSet;

public class SONY_occuranceOfLetterInParticularLocation
{
	public static void main(String[] args)
	{
		String b="selenium";
		char[] a = b.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		boolean c=false;
		for (int i = 0; i < a.length; i++) 
		{
			c=set.add(a[i]);
			if(c==false)
			{
				System.out.println(a[i]);
			}
		}
	}
}
