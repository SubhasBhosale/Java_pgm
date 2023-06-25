package assignment1;

public class pract_a11b22c33
{
	public static void main(String[] args)
	{
		String a="a11b22c33";    //o/p=>12
		int b=0;

		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				b=b+a.charAt(i)-48;
			}
		}
		System.out.println(b);
	}
}
