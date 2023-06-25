package interview_quetions;

import java.util.LinkedHashSet;

public class SONY_firstduplicateinString 
{
	public static void main(String[] args) 
	{
		String a = "selnriruemr";
		boolean flag = false;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++)
		{
			flag=set.add(a.charAt(i));
			if(flag==false)
			{
				System.out.println(a.charAt(i));
				break;
			}
		}
	}
}
