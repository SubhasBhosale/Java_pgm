package interview_quetions;

import java.util.TreeSet;

public class sony_capitalLetterInAscii
{
	public static void main(String[] args) 
	{
		String b="HelloBroAndQow";
		char[] a = b.toCharArray();

		TreeSet<Character>set=new TreeSet<Character>();
		for(int i=0;i<a.length;i++) 
		{
			if (a[i]>='A' && a[i]<='Z') 
			{
				set.add(a[i]);
			}
		}
		System.out.println(set);
	}
}
