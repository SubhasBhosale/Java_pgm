package string;

public class Print_ascii_value 
{
	public static void main(String[] args)
	{
		String b="subhAs";
		char[] a = b.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]-48);
		}
	}
}