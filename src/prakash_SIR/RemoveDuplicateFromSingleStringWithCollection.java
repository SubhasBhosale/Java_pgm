package prakash_SIR;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromSingleStringWithCollection 
{
	public static void main(String[] args) 
	{
		//String a="technolgy";
			String a="subhas";

		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}

		System.out.print(set);
	}

}
