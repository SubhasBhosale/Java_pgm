package trackmind;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String a="subhas bhosale";                   //o/p =>    elasohb sahbus

		//		for(int i=a.length()-1;i>=0;i--)
		//		{
		//			System.out.print(a.charAt(i));
		//		}


		//		String b="";

		//		for(int i=a.length()-1;i>=0;i--)
		//		{
		//			b=b+a.charAt(i);
		//		}
		//		System.out.println(b);

		//		char[] b = a.toCharArray();
		//		
		//		for (int i = b.length-1; i >= 0 ; i--) 
		//		{
		//			System.out.print(b[i]);
		//		}

		StringBuilder builder = new StringBuilder(a);
		StringBuilder reverse = builder.reverse();
		System.out.println(reverse);

	}
}