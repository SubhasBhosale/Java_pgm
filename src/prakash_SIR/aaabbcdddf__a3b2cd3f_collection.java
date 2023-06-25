package prakash_SIR;

import java.util.LinkedHashSet;

public class aaabbcdddf__a3b2cd3f_collection {

	public static void main(String[] args) {
		String a="aaabbcdddf";   //op=> a3b2cd3f
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		for(Character c:set)
		{
			int count=0;
			for(int i=0;i<a.length();i++)
			{
				if(c==a.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
				System.out.print(c);
			else
				System.out.print(c+""+count);
		}
	}

}
