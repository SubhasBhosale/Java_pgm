package string;

import java.util.LinkedHashSet;

public class noofCharrepeating {

	public static void main(String[] args) {
		String a="harshita";
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
//				System.out.println(s+" "+count);
				count1++;
			}
		}
		System.out.println(a+" "+count1);


	}

}
