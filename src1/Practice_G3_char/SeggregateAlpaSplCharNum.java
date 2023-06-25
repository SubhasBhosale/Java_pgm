package Practice_G3_char;

public class SeggregateAlpaSplCharNum 
{
	public static void main(String[] args) 
	{
		String s = "Ab7^57sd";
//		String s = b.toLowerCase();
		String b = ""; 	
		String a = "";
		String 	sp_char="";

		for (int i = 0; i < s.length(); i++) 
		{
			
			if (s.charAt(i)>='1' && s.charAt(i)<='9')
			{
				a=a+s.charAt(i);
			//	a=(a*10)+s.charAt(i)-48;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				b=b+s.charAt(i);
			}
			else
			{
				sp_char=sp_char+s.charAt(i);
		    }
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(sp_char);
	}}

