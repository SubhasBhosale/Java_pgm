package Anagram;

import java.util.Arrays;

public class Anagram_follow 
{
	public static boolean isAnagram(String a,String b)
	{
		String x = a.replaceAll("[^a-zA-Z0-9]", "");
		String y = b.replaceAll("[^a-zA-Z0-9]", "");

// ^ except a-z,A-Z & 0-9 other characters remove like special characters and spaces
	
		
		char[] c = x.toLowerCase().toCharArray();
		char[] d = y.toLowerCase().toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);

		if (c.length!=d.length)
		{
			return false;
		}		
		return Arrays.equals(c, d);
	}

	public static void main(String[] args) 
	{
		System.out.println(isAnagram("a decimal point","I’m a dot in place"));
		System.out.println(isAnagram("signature" ,"a true sign"));
	}
}








/*

a gentleman    ,      elegant man
a decimal point – I’m a dot in place

 */