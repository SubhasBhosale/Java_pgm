package prakash_SIR;

import java.util.LinkedHashSet;

public class RemoveDuplicateStringsWithCollection
{
	public static void main(String[] args) 
	{
		String[] a={"hello","hi","hello","hi"};

		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}

		for(String s:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(s.equals(a[i]))
				{
					count++;
				}
			}	
			if(count==2)
			{
				System.out.println(s);
			}
		}
	}

}
