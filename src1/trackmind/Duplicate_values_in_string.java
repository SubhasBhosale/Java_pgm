package trackmind;

import java.util.LinkedHashSet;

public class Duplicate_values_in_string 
{
	public static void main(String[] args) 
	{
		String a="aabbcccdaghgk";

		LinkedHashSet<Character>  set = new LinkedHashSet<Character>();

		for(int i=0;i<a.length();i++)
		{
		    set.add(a.charAt(i));
		}

		
		
		for(Character s:set)
		{
		int count=0;
		for(int i=0;i<a.length();i++)
		{
		    if(s==a.charAt(i))
		     {
		        count++;
		     }
		}

		System.out.println(s+" "+count);
		}
	}
}