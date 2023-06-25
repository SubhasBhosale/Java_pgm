package Ascii;

public class char_to_ascii
{
	public static void main(String[] args) 
	{
		String a="subhAs";
		
		for (int i = 0; i < a.length(); i++) 
		{
			System.out.println((int)a.charAt(i));
		}
	}
}
/*

115
117
98
104
65
115

*/