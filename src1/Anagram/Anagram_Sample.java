package Anagram;

import java.util.Arrays;

public class Anagram_Sample 
{
	public static void main(String[] args) 
	{
		String x="LISTEN";
		String y = "SILENT";
		
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		
		if (a.length!=b.length)
		{
			System.out.println("It is not anagram");
			System.exit(0);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < b.length; i++) 
		{
			if (a[i]!=b[i]) 
			{
				System.out.println("It is not anagram");
				System.exit(0);
			}
		}
		System.out.println("it is anagram");
	}
}

/*
monasteries – Amen stories
old England – golden land
restaurant – runs a treat
signature – a true sign
year two thousand – a year to shut down
a decimal point – I’m a dot in place



atom – bomb 
meals – males	
saint – satin

act – cat	case – aces 	note – tone	   tar – rat
aide – idea	   earth – heart	  ours – sour	     tea – eat
ape – pea	  fast – fats	   pat – tap	  urn – run
*/