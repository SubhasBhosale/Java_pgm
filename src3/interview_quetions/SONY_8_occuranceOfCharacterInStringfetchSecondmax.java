package interview_quetions;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SONY_8_occuranceOfCharacterInStringfetchSecondmax
{
	public static void main(String[] args) 
	{
		String a = "Thegrassisgreen";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		for (int i = 0; i < a.length(); i++)
		{
			set.add(a.charAt(i));
		}
		int b = Integer.MIN_VALUE;
		for (Character s : set) 
		{
			int count=0;
			for (int i = 0; i < a.length(); i++)
			{
				if (s==a.charAt(i))
				{
					count++;
				}
			}
			System.out.println(s+" ==>> "+count);
			set1.add(count);
		}
		set1.pollFirst();
		System.out.println(set1.pollFirst());
	}
}
