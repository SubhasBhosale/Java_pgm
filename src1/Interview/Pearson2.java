package Interview;

public class Pearson2 
{
	public static void main(String[] args) 
	{
		String a="a1b2c3";
		String b="";
		for (int i = 0; i < a.length(); i++)
		{
			
			if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				System.out.print(a.charAt(i));
			}
			else
			{
				b=b+a.charAt(i);
			}
			
		}
		System.out.println();
		System.out.print(b);
		
}
}
