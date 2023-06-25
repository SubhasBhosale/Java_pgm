package Practice_G3_char;

public class PrintOnlyVowelWithDuplicate {

	public static void main(String[] args) {
			String s = "India";
			String a = s.toLowerCase();
			for (int i = 0; i < a.length(); i++) 
			{
				if (a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
				{
					System.out.println(a.charAt(i));
				}
			}
	}

}
