package Interview_Program;

public class p13
{
	public static void main(String[] args) 
	{
		String a="subhas";
		String b="";
		
		for (int i = 0; i < a.length(); i++)
		{
			if (b.indexOf(a.charAt(i))==-1) 
			{
				b=b+a.charAt(i);
			}
		}
		System.out.println(b);
	}
}