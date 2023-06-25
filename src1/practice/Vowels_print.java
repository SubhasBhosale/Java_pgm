package practice;

public class Vowels_print 
{
	public static void main(String[] args) 
	{
		String a = "subhas";
		System.out.println(a);
		String vowels = "aeiouAEIOU";
		String foundVowels = "";

		foundVowels += (vowels.indexOf(a.charAt(0)) != -1) ? a.charAt(0) : "";
		foundVowels += (vowels.indexOf(a.charAt(1)) != -1) ? a.charAt(1) : "";
		foundVowels += (vowels.indexOf(a.charAt(2)) != -1) ? a.charAt(2) : "";
		foundVowels += (vowels.indexOf(a.charAt(3)) != -1) ? a.charAt(3) : "";
		foundVowels += (vowels.indexOf(a.charAt(4)) != -1) ? a.charAt(4) : "";
		foundVowels += (vowels.indexOf(a.charAt(5)) != -1) ? a.charAt(5) : "";

		System.out.println("Vowels found: " + foundVowels);
	}

}
