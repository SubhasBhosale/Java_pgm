package Anagram;

import java.util.Arrays;

public class Anagram_Generic 
{
	public static boolean isAnagram(String a,String b)
	{
		String a1 = a.replaceAll("[^a-zA-Z0-9]", "");
		String a2= b.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(a1);
		System.out.println(a2);
		if (a1.length()!=a2.length()) 
		{
			return false;
		}
		
		char[] b1 = a1.toLowerCase().toCharArray();
		char[] b2 = a2.toLowerCase().toCharArray();
		Arrays.sort(b1);
		Arrays.sort(b2);
		
		return Arrays.equals(b1, b2);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(isAnagram("silent ", "LIS TEN"));
	
//		System.out.println(isAnagram("old west act ion", "Clint   Eastwood"));
	}
}
