package string;

import java.util.LinkedHashSet;

public class Printrepeatingcharacter {
	public static void main(String[] args) {
		String a="harshitha";
		int count1=0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++) 
		{
			set.add(a.charAt(i));
		}

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

			if(count>1)
			{
				for(int i=0;i<count;i++)
				{
					System.out.print(s);
				}
			}
		}
	}
}