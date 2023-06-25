package string;

import javaclasses.LinkedHashMap;
import javaclasses.LinkedHashSet;

public class Strin 
{
	public static void main(String[] args) 
	{
		String b = "i am feeling sleepy";

		String[] a = b.split(" ");
		java.util.LinkedHashSet<Character> set = new java.util.LinkedHashSet<Character>();


		for (int i = 0; i < a.length; i++)
		{
			String str = a[i];
			char[] c = str.toCharArray();
			for (int j = 0; j < a.length; j++) 
			{
				set.add(c[i]);
			}
			System.out.println(str+" ");
		}
	}
}