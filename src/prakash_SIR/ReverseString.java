package prakash_SIR;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String a="krishna";

		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}


		char[] b=a.toCharArray();
		int count=0;
		for(Character c:b)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}


		char z='0';
		for(int i=a.length()-1;i>=0;i--)
		{
			z=a.charAt(i);
			System.out.print(z);
		}

		String d="";
		for(int i=a.length()-1;i>=0;i--)
		{
			d=d+a.charAt(i);
		}
		System.out.print(d);
		StringBuilder builder=new StringBuilder(a);
		builder.reverse();

	}
}
