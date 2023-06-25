package interview_quetions;

public class SONY_6_reverseString 
{
	public static void main(String[] args)
	{
		String s="Hello";

		for (int i = s.length()-1; i >= 0; i--)
		{
		//	System.out.print(s.charAt(i));
		}
		StringBuilder str = new StringBuilder(s);
	//	System.out.println(str.reverse());
		
		char[] a = s.toCharArray();
		int count=0;
		for (char c : a)
		{
			count++;
		}
		for (int i = count-1; i >= 0; i--) 
		{
			System.out.print(a[i]);
		}
		
		System.out.println();
		String b="";
		for (int i = s.length()-1; i >=0; i--) 
		{
			b=b+s.charAt(i);
		}
		System.out.println(b);
	}
}
