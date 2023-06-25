package Practice_G3_char;

public class PrintSumOfDigitInString
{
	public static void main(String[] args) 
	{
		String a="a1b2c3d4e5";
		int b=0;
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i)>='1' && a.charAt(i)<='9')
			{
				b=b+a.charAt(i)-48;
			}
		}
		System.out.println(b);
	}

}
