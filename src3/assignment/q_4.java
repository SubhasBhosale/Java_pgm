package assignment;

import java.util.LinkedHashSet;

public class q_4 {

	public static void main(String[] args) {
		String	b="My name is rishav it contains ri and shav";
		char[] a = b.toCharArray();
		LinkedHashSet<Character> set = new	LinkedHashSet<>();
		
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
			for ( Character s : set)
			{
				int count=0;
				for (int j = 0; j < a.length; j++) 
				{
					if (s==a[j]) 
					{
						count++;
					}
				}
				if (count>1) 
				{
				System.out.println(s+" ==>> "+count);	
				}
			}



	}

}
