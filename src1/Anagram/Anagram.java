package Anagram;

import java.util.Arrays;
import java.util.HashSet;

public class Anagram
{
	public static void main(String[] args) 
	{
		Object[] a= {7,"ABC","CBA","XYZ","AABD","BAAD","PRSH","DABA"};

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			String ch1 = a[i].toString();							//  String str1="ABC";
			char[] c1 = ch1.toCharArray();
			Arrays.sort(c1);
			boolean flag=false;
			for (int j = i+1; j < a.length; j++) 
			{
				String ch2 = a[j].toString();
				char[] c2 = ch2.toCharArray();						//  String str1="CBA";
				Arrays.sort(c2);
				if (c1.length==c2.length) 
				{
					for (int k = 0; k < c1.length; k++) 
					{
						if (c1[k]!=c2[k])
						{
							flag=true;
						}
					}
				}
				if (!(set.contains(c2)))
				{
					count=1;
				}
			}
			if (count==1) {
				{
					if (flag==false) 
					{
						System.out.println("Anagram "+a[i]);
						set.add(a[i].toString());
					}	
				}
			}
		}

	}
}